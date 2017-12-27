package com.fb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class BuzzResult implements Results{
	
	List<Integer> fizz = new ArrayList();
	String name ="Buzz";
	
	private static BuzzResult instance = new BuzzResult();
	
	private BuzzResult(){}
	public static BuzzResult getInstance(){
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
