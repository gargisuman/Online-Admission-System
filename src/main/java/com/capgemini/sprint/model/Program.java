package com.capgemini.sprint.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="program_table")
public class Program {
	@Id
	private int programId;
	private String programName;
	private String eligibility;
	private String duration;
	private String degreedOffered;
	public int getProgramId() {
		return programId;
	}
	public void setProgramId(int programId) {
		this.programId = programId;
	}
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	public String getEligibility() {
		return eligibility;
	}
	public void setEligibility(String eligibility) {
		this.eligibility = eligibility;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getDegreedOffered() {
		return degreedOffered;
	}
	public void setDegreedOffered(String degreedOffered) {
		this.degreedOffered = degreedOffered;
	}
	

}
	


