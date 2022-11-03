package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller2")
public class Controller {


    @RequestMapping("/method1")
    public void method1() {
        System.out.println(1);
    }

}
