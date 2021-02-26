package com.github.microprograms.spring_cloud_microservice_demo1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo1Controller {

    @RequestMapping("/health")
    public String health() {
        return "Ok";
    }

}
