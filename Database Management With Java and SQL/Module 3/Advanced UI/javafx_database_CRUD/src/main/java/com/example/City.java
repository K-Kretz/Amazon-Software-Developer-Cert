package com.example;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;

public class City {

    private IntegerProperty cityId;
    private StringProperty cityName;
    private StringProperty countryCode;
    private StringProperty district;
    private IntegerProperty population;
    
    public City(IntegerProperty cityId, StringProperty cityName, StringProperty countryCode, StringProperty district,
            IntegerProperty population) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.countryCode = countryCode;
        this.district = district;
        this.population = population;
    }

    public City(int cityId, String cityName, String countryCode, String district,
            int population) {
        this.cityId = new SimpleIntegerProperty(cityId);
        this.cityName = new SimpleStringProperty(cityName);
        this.countryCode = new SimpleStringProperty(countryCode);
        this.district = new SimpleStringProperty(district);
        this.population = new SimpleIntegerProperty(population);
    }

    public int getCityId() {
        return cityId.get();
    }

    public String getCityName() {
        return cityName.get();
    }

    public String getCountryCode() {
        return countryCode.get();
    }

    public String getDistrict() {
        return district.get();
    }

    public int getPopulation() {
        return population.get();
    }

    public  StringProperty getCityNameProperty() {
        return cityName;
    }

    

    

}
