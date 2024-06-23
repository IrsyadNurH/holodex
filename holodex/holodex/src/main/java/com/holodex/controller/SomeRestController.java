package com.holodex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeRestController {

    @GetMapping("/api/video")
    public String someEndpoint() {
        return "Data from some endpoint";

    }
}

