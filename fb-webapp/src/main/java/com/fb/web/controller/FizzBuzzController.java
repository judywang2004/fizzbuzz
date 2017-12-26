package com.fb.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.common.persistence.service.RawService;
import com.fb.service.FizzBuzzService;
import com.fb.util.FbMappings;
import com.google.common.collect.Lists;

@Controller
@RequestMapping(value = FbMappings.FB)
public class FizzBuzzController{

    @Autowired
    private FizzBuzzService service;

    public FizzBuzzController() {
        super();
    }

    // API

    // find - one

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public List<String> findFizzBuzz(@PathVariable("id") final Long id) {
    	 List<String> results = Lists.newArrayList("1","2","3");
    	 return results;
//        return service.findAll(id);
    }

   

}
