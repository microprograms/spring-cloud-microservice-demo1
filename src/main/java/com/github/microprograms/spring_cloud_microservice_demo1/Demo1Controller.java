package com.github.microprograms.spring_cloud_microservice_demo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo1")
public class Demo1Controller {

    @GetMapping("/health")
    @ResponseBody
    public String health() {
        return "Ok";
    }

}
