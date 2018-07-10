package com.dependency.depexample.controller;

import com.dependency.depexample.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorController {
    /******
     * we dont need @Autowired here because, object will automatically injected if we
     * are using constructor based injections
     */
    GreetingService greetingService;
    /**
     * if we have implementation of GreetingService, how does Spring know which Implementation of inject
     * in this case spring will throw an error.
     * To resolve this we can explicitly tell Spring to inject the object of an implementation bt qualifier
     */
    public ConstructorController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello(){
        return greetingService.greet();
    }

}
