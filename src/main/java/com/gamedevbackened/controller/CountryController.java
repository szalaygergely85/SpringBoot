package com.gamedevbackened.controller;

import com.gamedevbackened.model.Country;
import com.gamedevbackened.repository.CountryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CountryController {
    private final CountryRepository repository;

    public CountryController(CountryRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Optional<Country> getCountryByID(@RequestBody long countryId){
        
        return repository.findById(countryId);
    }
}

