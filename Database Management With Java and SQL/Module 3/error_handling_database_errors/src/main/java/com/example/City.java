package com.example;

public class City {
    private int cityId;
    private String name;
    private String countryCode;
    private String district;
    private int population;

    public City(int cityId, String name, String countryCode, String district, int population) {
        this.cityId = cityId;
        this.name = name;
        this.countryCode = countryCode;
        this.district = district;
        this.population = population;
    }
    

    public int getCityId() {
        return cityId;
    }
    public String getName() {
        return name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getDistrict() {
        return district;
    }

    public int getPopulation() {
        return population;
    } 

    

    
}
