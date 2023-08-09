package com.kartal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class TestController {

    @GetMapping(value = "/test")
    public String test(){
        return "v1 tested";
    }
}
