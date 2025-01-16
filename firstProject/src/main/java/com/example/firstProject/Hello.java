package com.example.firstProject;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("talha")
    public String sayHello(){
        return "Hello!!";
    }
}
