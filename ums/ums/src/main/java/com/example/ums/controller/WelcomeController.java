package com.example.ums.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class WelcomeController {

    

    @RequestMapping(value="/userRegistration", method = RequestMethod.GET)
    public String showTodos(ModelMap model){
    	System.out.println("Hello");
        return "userregistration";
    }
}