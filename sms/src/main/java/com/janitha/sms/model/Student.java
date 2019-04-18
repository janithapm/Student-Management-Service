package com.janitha.sms.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Student {
	
	@Id
	private Integer id;
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "student")  //student kiyanne column ekee nama
	//@JoinColumn(name = "iid")
	//since one to many - list
	private List<Telephone>  telephones;
	
	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
				name = "student_course",
				joinColumns = @JoinColumn(name = "sid", referencedColumnName = "id"),
				inverseJoinColumns = @JoinColumn(name = "cid" , referencedColumnName = "id")
			)
	private List<Course> courses ;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//getters and setters for address
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	//getters and setters for telephone numbers
	public List<Telephone> getTelephone() {
		return telephones;
	}
	public void setTelephone(List<Telephone> telephones) {
		this.telephones = telephones;
	}
	
	
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	
	
	
}
