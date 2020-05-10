package com.example.cloudclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestEnviroments {

    @Value("${propertiesMSG}")
    private String propertiesMessage;

    @GetMapping("/test")
    public String testIfIfHasProperPropertiesFromServer(){
        return propertiesMessage;
    }
}
