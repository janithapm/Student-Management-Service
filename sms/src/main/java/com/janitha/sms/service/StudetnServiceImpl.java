package com.janitha.sms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.janitha.sms.model.Student;
import com.janitha.sms.model.Telephone;
import com.janitha.sms.repository.StudentRepository;

@Service
public class StudetnServiceImpl  implements StudentService{

	@Autowired
	StudentRepository reposiroty;
	
	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		//student wa aragena eyaage telephone ekata student wa pass karanawa
		for (Telephone telephone : student.getTelephone()) {
			telephone.setStudent(student);
		}
		return reposiroty.save(student);
	}

	@Override
	public List<Student> fetch() {
		// TODO Auto-generated method stub
		return reposiroty.findAll();
	}

	@Override
	public Student fetch(Integer id) {
		// TODO Auto-generated method stub
		Optional<Student> stuOptional = reposiroty.findById(id);
		
		if (stuOptional.isPresent()) {
			return stuOptional.get() ;	
		}
		
		else {
			return null ;
		}
		
	}

}
