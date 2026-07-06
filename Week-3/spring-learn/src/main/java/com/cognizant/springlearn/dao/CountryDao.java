package com.cognizant.springlearn.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.springlearn.Country;

@Repository
public class CountryDao {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryDao.class);

    private final ApplicationContext context;

    public CountryDao() {
        context = new ClassPathXmlApplicationContext("country.xml");
    }

    public Country getCountry() {

        LOGGER.info("START");

        Country country = context.getBean("country", Country.class);

        LOGGER.info("END");

        return country;
    }

    @SuppressWarnings("unchecked")
    public List<Country> getAllCountries() {

        LOGGER.info("START");

        List<Country> countries = context.getBean("countryList", List.class);

        LOGGER.info("END");

        return countries;
    }
}