package com.general.ecommerce.controller;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/testcheck")
    public String testCheck(){
        return "Test check Rest API success..!";
    }

    @QueryMapping
    public String testCheckGQL(){
        return "Test testCheckGQL success..!";
    }

}
