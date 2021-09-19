package com.example.tempconverter.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/convertTemp")
@CrossOrigin("*")

public class Conversion {

    @PostMapping("/")
    public Float convertTemp(@RequestParam(name = "type_t") String type, @RequestParam("fromUnit") String fromUnit,
                             @RequestParam(name = "data_t") float data_t){
        if (type.equals("kelvin") && fromUnit.equals("celsius")){
            return  (data_t + 273.15f);
        }else if(type.equals("fahrenheit") && fromUnit.equals("celsius")){
            return  ((data_t*9)/5)+32;
        }else if(type.equals("celsius") && fromUnit.equals("fahrenheit")){
            return ((data_t-32)*5)/9;
        }else  if(type.equals("kelvin") && fromUnit.equals("fahrenheit")){
            return  273.5f + ((data_t - 32.0f) * (5.0f/9.0f));
        }else if(type.equals("celsius") && fromUnit.equals("kelvin")){
            return  ( data_t + 273.15f );
        }else if(type.equals("fahrenheit") && fromUnit.equals("kelvin")){
            return ((data_t - 273.15f) * 1.8f) + 32;
        }
        return 1.0f;

    }
}
