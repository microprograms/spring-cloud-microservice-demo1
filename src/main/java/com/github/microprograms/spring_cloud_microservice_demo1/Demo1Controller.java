package com.github.microprograms.spring_cloud_microservice_demo1;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo1Controller {

    @GetMapping("/health")
    public String health() throws InterruptedException {
        if (new Random().nextBoolean()) {
            Thread.sleep(5 * 1000);
        }
        return "Ok!";
    }

}
