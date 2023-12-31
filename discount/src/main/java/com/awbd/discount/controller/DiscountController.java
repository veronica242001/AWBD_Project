package com.awbd.discount.controller;

import com.awbd.discount.config.PropertiesConfig;
import com.awbd.discount.model.Discount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DiscountController {
    @Autowired
    private PropertiesConfig configuration;
    @Autowired
    Environment environment;
    @GetMapping("/discount")
    public Discount getDiscount(){
        return new
                Discount(configuration.getValue(),configuration.getPeriod(), environment.getProperty("info.app.version"));
    }
}
