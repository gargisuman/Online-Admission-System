package com.capgemini.sprint.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="programscheduled_table")
public class ProgramScheduled {
	@Id
	public int scheduled;
	@OneToOne(cascade=CascadeType.ALL)
	public Branch branch;
	@OneToOne(cascade=CascadeType.ALL)
	public Course course;
	@OneToOne(cascade=CascadeType.ALL)
	public Program program;
	@OneToOne(cascade=CascadeType.ALL)
	public College college;
	@OneToOne(cascade=CascadeType.ALL)
	public University university;
	public LocalDate startDate;
	public LocalDate endDate;
	public int getScheduled() {
		return scheduled;
	}
	public void setScheduled(int scheduled) {
		this.scheduled = scheduled;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Program getProgram() {
		return program;
	}
	public void setProgram(Program program) {
		this.program = program;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public University getUniversity() {
		return university;
	}
	public void setUniversity(University university) {
		this.university = university;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	

}


