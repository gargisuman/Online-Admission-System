package com.capgemini.sprint;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capgemini.sprint.exception.CollegeCreationException;
import com.capgemini.sprint.model.College;
import com.capgemini.sprint.repository.ICollegeRepository;
import com.capgemini.sprint.service.ICollegeService;



@SpringBootTest
public class SpringDemoAppApplicationTest {
		@Autowired
		private ICollegeRepository ICollegeRepos;
	@Autowired
	ICollegeService service;
		
		@Test
		public void testSave()
		{
			College college=new College();
			college.setCollegeRegId(2345);
			college.setCollegeName("AI");
			
			College t=null;
			try {
			 	t= service.addCollege(college);
			} catch (CollegeCreationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		assertNotNull(t);
			}

		@Test
		public  void viewAllCollegeDetails()
		{
			
			List<College> list=	service.viewAllCollegeDetails();
		assertThat(list).size().isGreaterThan(0);
		}
		@Test
		public void testForUpdate()
		{
			
			College t=ICollegeRepos.findById(2345).get();
			t.setCollegeName("Data Science");
			ICollegeRepos.save(t);
			//assertNotEquals("xyz", trainRepos.findById(1144).get().getTarinName());
		assertNotEquals("adfd", ICollegeRepos.findById(2345).get().getCollegeName());	
		
		}
	/*	@Test
		public void testForDelete()
		{
			int status=service.deletePaymentById(33);
			
			assertEquals(1, status);
		}*/
	}


