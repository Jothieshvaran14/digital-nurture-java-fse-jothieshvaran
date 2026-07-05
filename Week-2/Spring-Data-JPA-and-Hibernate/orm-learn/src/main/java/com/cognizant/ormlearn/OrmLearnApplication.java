package com.cognizant.ormlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    CountryService service;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("\n===== ALL COUNTRIES =====");
        service.getAllCountries().forEach(System.out::println);

        System.out.println("\n===== FIND =====");
        System.out.println(service.findCountryByCode("IN"));

        System.out.println("\n===== ADD =====");
        service.addCountry(new Country("JP", "Japan"));
        System.out.println(service.findCountryByCode("JP"));

        System.out.println("\n===== UPDATE =====");
        service.updateCountry("JP", "Japan Updated");
        System.out.println(service.findCountryByCode("JP"));

        System.out.println("\n===== SEARCH =====");
        service.searchCountry("Ind").forEach(System.out::println);

        System.out.println("\n===== DELETE =====");
        service.deleteCountry("JP");

        System.out.println("Completed.");
    }
}