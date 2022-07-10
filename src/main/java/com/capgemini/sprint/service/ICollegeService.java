package com.capgemini.sprint.service;
import java.util.List;

import com.capgemini.sprint.exception.CollegeCreationException;
import com.capgemini.sprint.exception.InvalidCollegeException;
import com.capgemini.sprint.model.College;
public interface ICollegeService {
	public College addCollege(College college) throws CollegeCreationException;
	public List<College>viewAllCollegeDetails();
	public List<College>getCollegeDetailsByProgram(String ProgramName);
	public List<College> getCollegeDetailsByCourse(String courseName);
	public List<College> getCollegeDetailsByBranch(String branchName);
	public List<College> getCollegeDetailsByName(String cName);
	public int deleteCollegeById(int collegeId);
	public int deleteCollegeByName(String collegeName);
	public int updateCollegeDetails(College college) throws InvalidCollegeException;
	public College getCollegeDetailsById(int collegeId);


}
