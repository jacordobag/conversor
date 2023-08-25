package com.conversor.model;

import java.util.*;

public class itemsModel {

    public static Map<String, Double> principalOptions(){
        Map<String, Double> options = new LinkedHashMap<>();
        options.put("Pesos a otra moneda",0.0);
        options.put("Otra moneda a pesos",0.0);
        options.put("Celsius a otra temperatura", 0.0);
        options.put("Otra temperatura a celsius", 0.0);
        return options;
    }
    public static Map<String, Double> currency(){
        Map<String, Double> currencies = new LinkedHashMap<>();
        currencies.put("Dolares", 17.0);
        currencies.put("Yenes",0.11);
        currencies.put("Euros", 18.2);
        currencies.put("Libras esterlinas", 21.14);
        currencies.put("Won surcoreano", 0.013);
        return currencies;
    }

    public static Map<String, Double> temperature(){
        Map<String, Double> temperatures = new LinkedHashMap<>();
        temperatures.put("Fahrenheit", 32.0);
        temperatures.put("Kelvin",273.15);
        return temperatures;
    }

}
