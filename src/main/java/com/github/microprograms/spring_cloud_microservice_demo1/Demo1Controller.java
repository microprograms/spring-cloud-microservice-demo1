package com.github.microprograms.spring_cloud_microservice_demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo1Controller {

    @GetMapping(value = "/health", produces = "application/json")
    public String health() {
        return "Ok!";
    }

}
