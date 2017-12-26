package com.fb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fb.service.FizzBuzzService;
import com.google.common.collect.Lists;


@Service
public class FizzBuzzServiceImpl implements FizzBuzzService {

    public FizzBuzzServiceImpl() {
        super();
    }

    // API

    // get/find

    @Override
    public List<String> findAll(final long input) {
        List<String> results = Lists.newArrayList("1","2","3");
        return results;
    }

   
}
