package com.swaggertest.swaggertest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String getEmployess(){
        return "hanuman"+"Test"+"swagger";
    }
}
