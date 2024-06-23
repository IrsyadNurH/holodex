package com.holodex.controller;

import com.holodex.service.ExternalAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Autowired
    private ExternalAPIService externalAPIService;

    @GetMapping("/video")
    public String fetchData(@RequestParam String apiUrl) {
        return externalAPIService.getExternalData(apiUrl);
    }
}
