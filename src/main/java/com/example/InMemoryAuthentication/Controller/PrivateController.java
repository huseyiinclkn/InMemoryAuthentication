package com.example.InMemoryAuthentication.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private")
public class PrivateController {

    @GetMapping
    public String helloWorld(){
        return "Hello World ' from private endpoint";
    }

    @GetMapping("/user")
    public String helloWorldUserPrivate(){
        return "Hello World ' from private endpoint";
    }

    @GetMapping("/admin")
    public String hheeloWorldAdminPrivate(){
        return "Hello World ' from private endpoint";
    }
}
