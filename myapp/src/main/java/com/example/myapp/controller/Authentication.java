package com.example.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.dto.SignupRequest;

@RestController
@RequestMapping("/api")
public class Authentication {
    @PostMapping("/signup")
    String m(@RequestBody SignupRequest obj){
        System.out.println("\t name :"+obj.getName());
        System.out.println("\t name :"+obj.getEmail());
        System.out.println("\t name :"+obj.getPassword());
        return "signup sucess";
    }
}
