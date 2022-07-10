package com.capgemini.sprint.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.sprint.dao.ICollegeDao;
import com.capgemini.sprint.exception.CollegeCreationException;
import com.capgemini.sprint.exception.InvalidCollegeException;
import com.capgemini.sprint.model.College;
@RestController
public class ICollegeController {
	@Autowired
	 private ICollegeDao dao;
	Logger log=LoggerFactory.getLogger(ICollegeController.class);
	
	@PostMapping(path="/create College")
	public College addCollege(@Valid @RequestBody College college) throws CollegeCreationException {
		College k= dao.addCollege(college);
		if(k!=null)
		{
			System.out.println("College is added");
			log.info("College is added");
		}
		else
		{
			System.out.println("Not able to add College");
			log.error("College is not added");
		}
		return k;		
	}
	@GetMapping(path="/viewAllCollegeDetails")	
	public List<College> viewAllCollegeDetails(){
		log.info("viewAllCourseDetails");
		return dao.viewAllCollegeDetails();
		
   }
	@DeleteMapping(path="/deleteCollegeById/{collegeId}")
	public int deleteCollegeById(@PathVariable int collegeId) {
		return dao.deleteCollegeById(collegeId);
	}
	
	@DeleteMapping(path="/deleteCollegeByName/{collegeName}")
	public int deleteCollegeByName(@PathVariable String collegeName) {
		return dao.deleteCollegeByName(collegeName);
	}
	
	@PutMapping(path="/updateCollegeDetails/{collegeId}")
	public int updateCollegeDetails(@Valid @RequestBody College name, @PathVariable int collegeId) throws InvalidCollegeException{
		int k1= dao.updateCollegeDetails(name);
		if(k1!=0) {
			System.out.println("College detaits updated");
			log.info("College is updated");
		}
		else {
			System.out.println("College details not updated");
			log.info("College is not updated");
		}
		return k1;
	}
	@GetMapping(path="/getCollegeDetailsById/{collegeId}")
	public College getCollegeDtailsById(@PathVariable int collegeId) {
		return dao.getCollegeDetailsById(collegeId);
		
	}
	@GetMapping(path="/getCollegeDetailsByName{cName}")
	public List<College> getCollegeDetailsByName(@PathVariable String cName){
		return dao.getCollegeDetailsByName(cName);
	}
	@GetMapping(path="/getCollegeDetailsByCourse{courseName}")
	public List<College> getCollegeDetailsByCourse(@PathVariable String courseName){
		return dao.getCollegeDetailsByCourse(courseName);
	}
	@GetMapping(path="/getCollegeDetailsByProgram/{ProgramName}")
	public List<College> getCollegeDetailsByProgram(@PathVariable String ProgramName){
		return dao.getCollegeDetailsByProgram(ProgramName);
	}
	@GetMapping(path="/getCollegeDetailsByBranch/{branchName}")
	public List<College> getCollegeDetailsByBranch(@PathVariable String branchName){
		return dao.getCollegeDetailsByBranch(branchName);
	}
	
}


