package com.janitha.sms.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Telephone {
	
	@Id
	private Integer tid;
	private String type;
	private String number;
	
	@ManyToOne
	//@JoinColumn(name = "iid",referencedColumnName = "id")
	@JoinColumn              //shows the ownerity of the couln ekee 
	@JsonIgnore                //json eka digatama refer karanna oone nathi nisaa ignore karanna kiyanawa
	private Student student;
	
	public Integer getId() {
		return tid;
	}
	public void setId(Integer tid) {
		this.tid = tid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}

	
	
}
