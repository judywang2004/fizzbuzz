package com.fb.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fb.service.FizzBuzzService;


@Service
public class FizzBuzzServiceImpl implements FizzBuzzService {

    public FizzBuzzServiceImpl() {
        super();
    }

    // API

    @Override
    public HashMap<String, List<Integer>> findAll(int input) {
    	
    	FizzBuzzFactory fb = new FizzBuzzFactory();
    	fb.clearall();
    	
    	  IntStream.rangeClosed(0, input).mapToObj(
		            i -> i % 3 == 0 ?
		                    (i % 5 == 0 ? fb.getResult("Fizzbuzz", i) : fb.getResult("Fizz", i)) :
		                    (i % 5 == 0 ? fb.getResult("Buzz", i) : i))
		            .forEach(System.out::println);
		    
    	return fb.res2;
    }

   
}
