package com.way2learnonline.aspects;


import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.way2learnonline.domain.Customer;

	public class LoggingAspect {
		
		
		
		public void logBefore(JoinPoint joinpoint){
			System.out.println("Before......" +joinpoint.getSignature().getName()
					+" with  args "+Arrays.toString(joinpoint.getArgs()));
		}
		
		
		public void logAfterReturning(JoinPoint joinpoint,Customer customer){
			System.out.println("After returning......" +joinpoint.getSignature().getName()
					+" with  args "+Arrays.toString(joinpoint.getArgs()) +" Return Value is "+customer);
		}
		
		
		public void logAfterThrowing(JoinPoint joinpoint,DataAccessException e){
			System.out.println("After Throwing......" +joinpoint.getSignature().getName()
					+" with  args "+Arrays.toString(joinpoint.getArgs())+" Exception is "+e);
			
			throw new RuntimeException("Rethrowing Own Exception");
		}
		
		
		public void logAfter(JoinPoint joinpoint){
			System.out.println("After......" +joinpoint.getSignature().getName()
					+" with  args "+Arrays.toString(joinpoint.getArgs()));
			
			
		}
	
	}
	
	
	
	
	
	
	
	
	

	