package com.capgemini.sprint;

import java.time.LocalDateTime;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capgemini.sprint.exception.CollegeCreationException;
import com.capgemini.sprint.exception.ErrorMessage;
import com.capgemini.sprint.exception.InvalidCollegeException;

@ControllerAdvice

public class GlobalExceptionHandler {
	
		/*
		 *  1
		 *  2
		 *  client send request 
		 * 
		 */

		@ExceptionHandler(InvalidCollegeException.class)
		public @ResponseBody ErrorMessage checkInvalidBookException(InvalidCollegeException e)
		
		{
			ErrorMessage error1=new ErrorMessage(LocalDateTime.now(), e.getMessage());
			return error1;
		}
		@ExceptionHandler(CollegeCreationException.class)
		public @ResponseBody ErrorMessage checkBookCreationException(CollegeCreationException e)
		
		{
			ErrorMessage error1=new ErrorMessage(LocalDateTime.now(), e.getMessage());
			return error1;
		}
		
		/*@ExceptionHandler(InvalidLoginException.class)
		public ResponseEntity<Object> checkInvalidLogin(InvalidLoginException e)
		{
			
			ErrorMessage responseError=new ErrorMessage(LocalDateTime.now(), e.getMessage());
			ResponseEntity< Object> res=new ResponseEntity<Object>(responseError, HttpStatus.BAD_REQUEST);
			return res;
			
		}*/
		//validation
		
		@ExceptionHandler(MethodArgumentNotValidException.class)
		public @ResponseBody ErrorMessage checkCourseValidation(MethodArgumentNotValidException e)
		
		{
			ErrorMessage error1=new ErrorMessage(LocalDateTime.now(), e.getMessage(),e.getBindingResult().toString());
			return error1;
		}
		
		
		
		
			 
		}


