package com.example.airbnb.entities;

/**
 * Location
 */
public class Location {

    String city;
    String country;
    String description;
    String airportName;
    String distanceFromAirport;

    public Location(String city, String country, String description, String airportName, String distanceFromAirport) {
        this.city = city;
        this.country = country;
        this.description = description;
        this.airportName = airportName;
        this.distanceFromAirport = distanceFromAirport;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAirportName() {
        return this.airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getDistanceFromAirport() {
        return this.distanceFromAirport;
    }

    public void setDistanceFromAirport(String distanceFromAirport) {
        this.distanceFromAirport = distanceFromAirport;
    }

}