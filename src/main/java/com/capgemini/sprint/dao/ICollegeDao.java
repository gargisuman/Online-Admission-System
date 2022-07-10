package com.capgemini.sprint.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.sprint.exception.CollegeCreationException;
import com.capgemini.sprint.exception.InvalidCollegeException;
import com.capgemini.sprint.model.College;
import com.capgemini.sprint.repository.ICollegeRepository;
import com.capgemini.sprint.service.ICollegeService;

@Service
public class ICollegeDao implements ICollegeService{
	@Autowired
	
	private ICollegeRepository repositoryCollege;

	@Override
	public College addCollege(College college) throws CollegeCreationException {
		// TODO Auto-generated method stub
		if(repositoryCollege.existsById(college.getCollegeRegId()))
		{
			throw new CollegeCreationException("Id already existing");
		}
		else {
		return repositoryCollege.save(college);
		}

	}

	@Override
	public List<College> viewAllCollegeDetails() {
		// TODO Auto-generated method stub
		return repositoryCollege.findAll();
	}

	@Override
	public List<College> getCollegeDetailsByProgram(String ProgramName) {
		// TODO Auto-generated method stub
		return repositoryCollege.getCollegeDetailsByProgram(ProgramName) ;
	}

	@Override
	public List<College> getCollegeDetailsByCourse(String courseName) {
		// TODO Auto-generated method stub
		return repositoryCollege.getCollegeDetailsByCourse(courseName) ;
	}

	@Override
	public List<College> getCollegeDetailsByBranch(String branchName) {
		// TODO Auto-generated method stub
		return repositoryCollege.getCollegeDetailsByBranch(branchName) ;
	}

	@Override
	public List<College> getCollegeDetailsByName(String cName) {
		// TODO Auto-generated method stub
		return repositoryCollege.getCollegeDetailsByName(cName) ;
	}

	@Override
	public int deleteCollegeById(int collegeId) {
		// TODO Auto-generated method stub
		return repositoryCollege.deleteCollegeById(collegeId) ;
	}

	@Override
	public int deleteCollegeByName(String collegeName) {
		// TODO Auto-generated method stub
		return repositoryCollege.deleteCollegeByName(collegeName);
	}

	@Override
	public int updateCollegeDetails(College college) throws InvalidCollegeException {
		// TODO Auto-generated method stub
		int z=0;
		if(repositoryCollege.existsById(college.getCollegeRegId()))
		{
		int k=college.getCollegeRegId();
		String collegeName=college.getCollegeName();
		 z=repositoryCollege.updateCollegeDetails(collegeName,k);
		return z;
		}
		{
			throw new InvalidCollegeException("College Update is not done");
		}
	}

	@Override
	public College getCollegeDetailsById(int collegeId) {
		// TODO Auto-generated method stub
		return repositoryCollege.findById(collegeId).get();
	}
}
	