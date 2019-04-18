package com.janitha.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.janitha.sms.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	
}
