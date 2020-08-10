package com.learning.aws.country.service;

import com.learning.aws.country.persistence.entity.CountryCapital;
import com.learning.aws.country.persistence.repository.CountryCapitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryDetailsService {

    @Autowired
    private CountryCapitalRepository countryCapitalRepository;

    public List<CountryCapital> getAllCountryCapital(){
        return countryCapitalRepository.findAll();
    }

    public List<CountryCapital> getCountryCapital(List<String> countryNameList){
        return countryCapitalRepository.findAllById(countryNameList);
    }

    public List<CountryCapital> saveCountryCapital(List<CountryCapital> countryCapitalList){
        return countryCapitalRepository.saveAll(countryCapitalList);
    }


}
