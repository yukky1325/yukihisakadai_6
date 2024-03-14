package com.yukihisakadai_6.yukihisakadai_6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HellloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
