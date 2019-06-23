package com.example.airbnb.entities;

/**
 * Review
 */
public class Review {

    String guestName;
    String date;
    String description;

    public Review(String guestName, String date, String description) {
        this.guestName = guestName;
        this.date = date;
        this.description = description;
    }

    public String getGuestName() {
        return this.guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getdescription() {
        return this.description;
    }

    public void setdescription(String description) {
        this.description = description;
    }

}