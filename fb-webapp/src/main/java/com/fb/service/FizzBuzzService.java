package com.fb.service;

import java.util.List;

public interface FizzBuzzService <T> {
	
	/**
     * - contract: if nothing is found, an empty list will be returned to the calling client <br>
     */
    List<T> findAll(final long id);

}
