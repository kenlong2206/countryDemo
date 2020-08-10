package com.learning.aws.country.controller;

import com.learning.aws.country.persistence.entity.CountryCapital;
import com.learning.aws.country.service.CountryDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CountryModelController {

    @Autowired
    private CountryDetailsService countryDetailsService;

//    @RequestMapping(value ={"","/"})
//    public String sayHello () {
//        return "index";
//    }

    @RequestMapping("/countryCapital")
    public String listContact(Model model) {
        List<CountryCapital> countryCapitalList = countryDetailsService.getAllCountryCapital();
        model.addAttribute("details", countryCapitalList);
        return "countrycapital";
    }

}
