package com.holodex.controller;

import com.holodex.service.ExternalAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExternalAPIController {

    ExternalAPIService externalAPIService;


    @Autowired
    public ExternalAPIController(ExternalAPIService externalAPIService) {
        this.externalAPIService = externalAPIService;
    }

    @GetMapping("/fetch-external-data")
    public String fetchExternalData(@RequestParam String apiUrl) {
        return externalAPIService.getExternalData(apiUrl);
    }
}

