package com.cognizant.spring_rest_handson.controller;

import com.cognizant.spring_rest_handson.model.Country;
import com.cognizant.spring_rest_handson.service.CountryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/country")
    public Country getCountry() {
        return countryService.getCountry();
    }

}