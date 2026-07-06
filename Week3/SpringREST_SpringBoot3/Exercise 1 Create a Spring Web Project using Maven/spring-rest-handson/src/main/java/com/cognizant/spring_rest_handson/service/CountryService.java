package com.cognizant.spring_rest_handson.service;

import org.springframework.stereotype.Service;
import com.cognizant.spring_rest_handson.model.Country;

@Service
public class CountryService {

    public Country getCountry() {

        Country country = new Country();
        country.setCode("IN");
        country.setName("India");

        return country;
    }
}