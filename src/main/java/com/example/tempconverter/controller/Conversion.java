package com.example.tempconverter.controller;

import com.example.tempconverter.entity.Temperature;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class Conversion {

    @PostMapping("/convertTemp")
    public Float convertTemp(@RequestBody Temperature temperature){
        String type = temperature.getToUnit();
        String fromUnit = temperature.getFromUnit();
        float data_t = temperature.getData();

        if (type.equals("kelvin") && fromUnit.equals("celsius")) {
            return  (data_t + 273.15f);
        }else if(type.equals("fahrenheit") && fromUnit.equals("celsius")) {
            return  ((data_t*9)/5) + 32;
        }else if(type.equals("celsius") && fromUnit.equals("fahrenheit")){
            return ((data_t-32)*5) / 9;
        }else  if(type.equals("kelvin") && fromUnit.equals("fahrenheit")){
            return  273.5f + ((data_t - 32.0f) * (5.0f/9.0f));
        }else if(type.equals("celsius") && fromUnit.equals("kelvin")){
            return  ( data_t + 273.15f );
        }else if(type.equals("fahrenheit") && fromUnit.equals("kelvin")){
            return ((data_t - 273.15f) * 1.8f) + 32;
        }
        return data_t;
    }
}
