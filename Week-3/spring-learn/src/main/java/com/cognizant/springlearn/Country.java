package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Country {

    private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);

    @NotNull(message = "Country code cannot be null")
    @Size(min = 2, max = 2, message = "Country code should be 2 characters")
    private String code;

    @NotNull(message = "Country name cannot be null")
    private String name;

    public Country() {
        LOGGER.debug("Inside Country Constructor.");
    }

    public String getCode() {
        LOGGER.debug("getCode()");
        return code;
    }

    public void setCode(String code) {
        LOGGER.debug("setCode({})", code);
        this.code = code;
    }

    public String getName() {
        LOGGER.debug("getName()");
        return name;
    }

    public void setName(String name) {
        LOGGER.debug("setName({})", name);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}