package com.genesis.facade;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/api/v0/hello")
    public String helloWorld() {
        return "Hello Spring!";
    }
}
