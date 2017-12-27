package com.fb.service;

import java.util.HashMap;
import java.util.List;

public interface FizzBuzzService<T>{
	
	/**
     * - contract: if nothing is found, an empty map will be returned to the calling client <br>
     */
	HashMap<String, List<Integer>> findAll(final int id);

}
