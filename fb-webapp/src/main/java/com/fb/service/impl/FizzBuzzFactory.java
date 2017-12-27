package com.fb.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *  @author Judy Wang
 * Factory pattern implementation:
 * In FizzBuzzFactory class, it will pass information (fizz/buzz/fizzbuzz) to the factory to get the type of object needs to be created.

*/

public class FizzBuzzFactory {
	List<Results> res = new ArrayList();
	HashMap<String, List<Integer>> res2 = new HashMap<String, List<Integer>>();
	
	public HashMap<String, List<Integer>> getResult(String type,int input){
		if(type.equalsIgnoreCase("Fizz")){
			 FizzResult.getInstance().add(input);			 
		}else if (type.equalsIgnoreCase("Buzz")){
			 BuzzResult.getInstance().add(input);
		}else if(type.equalsIgnoreCase("FizzBuzz")){
			 FizzBuzzResult.getInstance().add(input);
		}
		
		if(FizzResult.getInstance().fizz.size()>1)
			res2.put(FizzResult.getInstance().name,FizzResult.getInstance().fizz);		
		
		if(BuzzResult.getInstance().fizz.size()>1)
			res2.put(BuzzResult.getInstance().name,BuzzResult.getInstance().fizz);
		
		
		if(FizzBuzzResult.getInstance().fizz.size()>1)
			res2.put(FizzBuzzResult.getInstance().name,FizzBuzzResult.getInstance().fizz);
		
		return res2;
		
	}
	
	public void clearall(){
		if(FizzResult.getInstance() !=null ){
			FizzResult.getInstance().fizz.clear();
		}
		if(BuzzResult.getInstance() !=null ){
			BuzzResult.getInstance().fizz.clear();
		}
		if(FizzBuzzResult.getInstance() !=null ){
			FizzBuzzResult.getInstance().fizz.clear();
		}
		
	}

}
