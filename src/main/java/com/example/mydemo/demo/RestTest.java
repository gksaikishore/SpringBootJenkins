package com.example.mydemo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTest {

    @GetMapping("/rest/{name}")
    public String greetRest(@PathVariable String name) {
        return "Hello " + name + "!! Welcome to rest";
    }
}
