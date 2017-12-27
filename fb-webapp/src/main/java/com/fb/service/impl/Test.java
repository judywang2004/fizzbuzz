package com.fb.service.impl;


import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {	
		
		FizzBuzzFactory fb = new FizzBuzzFactory();
		    
		    IntStream.rangeClosed(0, 20).mapToObj(
		            i -> i % 3 == 0 ?
		                    (i % 5 == 0 ? fb.getResult("Fizzbuzz", i) : fb.getResult("Fizz", i)) :
		                    (i % 5 == 0 ? fb.getResult("Buzz", i) : i))
		            .forEach(System.out::println);
		    
		    System.out.println("TestMain:"+fb.res2);
	}

	
}
