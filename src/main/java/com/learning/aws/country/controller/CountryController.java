package com.learning.aws.country.controller;

import com.learning.aws.country.persistence.entity.CountryCapital;
import com.learning.aws.country.service.CountryDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private CountryDetailsService countryDetailsService;

    @RequestMapping(method = RequestMethod.GET,value="/api/allCountryCapital")
    public List<CountryCapital> getAllCountryCapital(){
        return countryDetailsService.getAllCountryCapital();
    }

    @RequestMapping(method = RequestMethod.GET,value="/api/countryCapital")
    public List<CountryCapital> getCountryCapital(@RequestParam(value="countryList") List<String> countryList){
        return countryDetailsService.getCountryCapital(countryList);
    }

    @RequestMapping(method = RequestMethod.POST,value="/country/saveCountryCapital")
    public List<CountryCapital> saveCountryCapital(@RequestBody List<CountryCapital> countryCapitalList){
        return countryDetailsService.saveCountryCapital(countryCapitalList);
    }

}
