package com.cognizant.springlearn.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.dao.CountryDao;
import com.cognizant.springlearn.exception.CountryNotFoundException;

@Service
public class CountryService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryService.class);

    private final CountryDao countryDao;

    public CountryService(CountryDao countryDao) {
        this.countryDao = countryDao;
    }

    public Country getCountry() {

        LOGGER.info("START");

        Country country = countryDao.getCountry();

        LOGGER.info("END");

        return country;
    }

    public List<Country> getAllCountries() {

        LOGGER.info("START");

        List<Country> countries = countryDao.getAllCountries();

        LOGGER.info("END");

        return countries;
    }

    public Country getCountry(String code) throws CountryNotFoundException {

        LOGGER.info("START");

        Country country = countryDao.getAllCountries()
                .stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);

        if (country == null) {
            throw new CountryNotFoundException();
        }

        LOGGER.info("END");

        return country;
    }
}