package com.holodex.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

@Service // Tambahkan anotasi @Service untuk mendefinisikan sebagai Spring bean
public class ExternalAPIService {

    @Value("${api.token}")
    private String apiToken;

    private final RestTemplate restTemplate;

    // Definisikan logger
    private static final Logger logger = LoggerFactory.getLogger(ExternalAPIService.class);

    public ExternalAPIService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getExternalData(String apiUrl) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + apiToken);

        logger.info("Requesting API: " + apiUrl);
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<String> response = restTemplate.exchange(apiUrl, HttpMethod.GET, entity, String.class);

        logger.info("Response: " + response.getBody());
        return response.getBody();
    }
}
