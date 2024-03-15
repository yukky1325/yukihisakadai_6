package com.yukihisakadai_6.yukihisakadai_6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/hello")
    public HelloResponse hello() {
        return new HelloResponse("hello world");
    }


    @GetMapping("/bye")
    public ByeResponse bye() {
        return new ByeResponse("Bye world");
    }
}
