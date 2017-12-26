package com.fb.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.fb.service" })
public class FbServiceConfig {

    public FbServiceConfig() {
        super();
    }

    // beans

}
