package com.fb.web.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.ResponseBody;


import com.common.web.RestPreconditions;
import com.common.web.exception.MyBadRequestException;
import com.fb.service.FizzBuzzService;
import com.fb.util.FbMappings;


@Controller
@RequestMapping(value = FbMappings.FB)
public class FizzBuzzController{

    @Autowired
    private FizzBuzzService service;

    public FizzBuzzController() {
        super();
    }

    // API

    // find - results

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public HashMap<String, List<Integer>> findFizzBuzz(@PathVariable("id") final int id){    
    	RestPreconditions.checkNotNull(id);    	 
    	return service.findAll(id);
    }

   

}
