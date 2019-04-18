package com.janitha.sms.controller;

import java.util.List;

import org.dom4j.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.janitha.sms.exception.SMSException;
import com.janitha.sms.model.Student;
import com.janitha.sms.service.StudentService;

@RestController
@RequestMapping(value="/smsCloud") 
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping(value="/hello")
	public String greeting() {
		return "Hello from Spring Boot";
	}
	
//	@RequestMapping(value = "/student")
//	//give a student to client
//	public Student getStudent() {
//		Student s = new Student();
//		s.setName("Janitha");
//		s.setCity("Walasmulla");
//		s.setId(1);
//		return s;
//	}
//	
//	@RequestMapping(value = "/student" , method =RequestMethod.POST )
//	public Student save(@RequestBody Student s ) {
//		System.out.println("student is "+ s.getName());
//		return s ;
//	}
//	
//	@RequestMapping(value="/hi")
//	public String greetingGETfROMurl(@RequestParam String name) {
//		return "Hello from Spring Boot " + name;
//	}
//	
//	@RequestMapping(value = "/student" , method =RequestMethod.GET )
//	public ResponseEntity<Student> fetch() {
//		//System.out.println("student is "+ s.getName());
//		//ResponseEntity<Student> entity = new ResponseEntity<Student>();
//		return ResponseEntity.notFound().build() ;
//	}
//	
	
	@RequestMapping(value = "/student" , method =RequestMethod.POST )
	public Student save(@RequestBody Student s ) {
		System.out.println("student is "+ s.getName());	
		return (studentService.save(s)) ;
	}
	
	@RequestMapping(value = "/student" , method =RequestMethod.GET )
	public List<Student> fetch(){
		return studentService.fetch();
	}
	
	
	@RequestMapping(value = "/student/{id}" , method =RequestMethod.GET )
	public ResponseEntity<Student> fetch(@PathVariable Integer id){
		if (id <= 0 ) {
			return ResponseEntity.badRequest().build();
		}
		else {
			Student student = studentService.fetch(id);
			if (student == null) {
				throw new SMSException("document not found!", "er-404");
			}
			else {
				return ResponseEntity.ok(student);
			}
		}
	}
	
	
}
