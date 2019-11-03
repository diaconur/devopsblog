package com.example.devopsblog.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/player/{name}")
    public String getHelloPlayerName(@PathVariable("name") String name){
        return "Hello player "+name;
    }

    @PostMapping("/happy")
    public String happyBirthdayUser(@RequestBody String name){
        return "Happy birthday to you, "+name;
    }
}
