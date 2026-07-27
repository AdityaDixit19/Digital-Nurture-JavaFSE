package com.cognizant.spring_learn.repo;

import com.cognizant.spring_learn.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CountryRepo {

    private List<Country> countries;

    public CountryRepo( @Autowired List<Country> countries) {
        this.countries = new ArrayList<>(countries);
    }

    public Country findByCode(String code) {
        for(int i=0;i<countries.size();i++)
            if(countries.get(i).getCode().equalsIgnoreCase(code))
                return countries.get(i);
        return new Country();
    }
}