
package com.janitha.sms.service;

import java.util.List;

import com.janitha.sms.model.Student;

public interface StudentService {
	
	Student save(Student student);
	
	List<Student> fetch();
	
	Student fetch(Integer id);

}
