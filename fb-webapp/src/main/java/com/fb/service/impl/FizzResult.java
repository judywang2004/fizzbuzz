package com.fb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 
 * @author Judy Wang
 * All three *zzRefult classes are using Singleton to make sure only one single each object get created.
 */

public class FizzResult implements Results {
	List<Integer> fizz = new ArrayList();
	String name ="Fizz";
	
	private static FizzResult instance = new FizzResult();
	
	private FizzResult(){}
	public static FizzResult getInstance(){
		return instance;
	}
	
	@Override
	public void add(int input){
		fizz.add(input);		
	}
	
	 @Override
	    public String toString() {
	        return new ToStringBuilder(this).append(name).append(fizz.toString()).toString();
	    }

}
