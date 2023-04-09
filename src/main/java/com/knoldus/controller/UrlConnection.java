package com.knoldus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class UrlConnection {

    @GetMapping("/status")
    public String getStatus(){
        return "Running, " + LocalTime.now();
    }
}
