package com.capgemini.sprint.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="branch_table")
public class Branch {
	@Id
	public int branchId;
	public String branchName;
	public String branchDescription;
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchDescription() {
		return branchDescription;
	}
	public void setBranchDescription(String branchDescription) {
		this.branchDescription = branchDescription;
	}

}
