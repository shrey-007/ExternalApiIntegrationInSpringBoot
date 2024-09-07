package com.example.ExternalAPI.service;

import com.example.ExternalAPI.pojo.ApiResponse;
import com.example.ExternalAPI.pojo.WeatherData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WeatherAPI {

    private static final String API_KEY = "d4b60a861cmshba954334e83499dp1fb1a7jsnc73ba475887d";
    private static final String API_HOST = "linkedin-data-api.p.rapidapi.com";
    private static final String URL= "https://linkedin-data-api.p.rapidapi.com/get-company-by-domain?domain=apple.com";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hi")
    public void getWeather(String city){

        HttpHeaders httpHeaders=new HttpHeaders();
        httpHeaders.set("x-rapidapi-key", API_KEY);
        httpHeaders.set("x-rapidapi-host", API_HOST);

        HttpEntity<String> entity = new HttpEntity<>(httpHeaders);

        ResponseEntity<ApiResponse> response = restTemplate.exchange(URL, HttpMethod.GET,entity, ApiResponse.class);
        ApiResponse apiResponse=response.getBody();
        System.out.println(apiResponse);

    }


}
