package com.capgemini.sprint.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Range;
@Entity
@Table(name="College_Table")
public class College {
	@Id
	@Range(min=1)
	private int collegeRegId;
	@NotBlank(message="College name cannot be blank")
	private String collegeName;
	@OneToOne (cascade=CascadeType.ALL)
	private Address address;
	@OneToMany (cascade=CascadeType.ALL)
	private List<Program> programList;
	@OneToMany (cascade=CascadeType.ALL)
	private List<Course> courseList;
	@OneToMany (cascade=CascadeType.ALL)
	private List<Branch> batchList;
	@ManyToOne (cascade=CascadeType.ALL)
	private University university;
	public int getCollegeRegId() {
		return collegeRegId;
	}
	public void setCollegeRegId(int collegeRegId) {
		this.collegeRegId = collegeRegId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Program> getProgramList() {
		return programList;
	}
	public void setProgramList(List<Program> programList) {
		this.programList = programList;
	}
	public List<Course> getCourseList() {
		return courseList;
	}
	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
	public List<Branch> getBatchList() {
		return batchList;
	}
	public void setBatchList(List<Branch> batchList) {
		this.batchList = batchList;
	}
	public University getUniversity() {
		return university;
	}
	public void setUniversity(University university) {
		this.university = university;
	}

	
}
