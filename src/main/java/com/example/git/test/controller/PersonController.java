package com.example.git.test.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    public void add(){
        System.out.println("add member");
    }

    public void get(){
        System.out.println("get all");
    }


    public void getAll(){
        System.out.println("get all");
    }
}
