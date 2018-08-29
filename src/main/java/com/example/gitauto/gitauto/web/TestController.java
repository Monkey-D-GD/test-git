package com.example.gitauto.gitauto.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hellos")
    public String getHelloWorld(){
        return "hello world";
    }
}
