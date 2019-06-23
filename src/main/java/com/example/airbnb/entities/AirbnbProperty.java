package com.example.airbnb.entities;

/**
 * AirbnbProperty
 */
public class AirbnbProperty {
    
    Property[] properties;
    GuestSuite[] guestSuites;
    Amenity[] amenities;
    Accessibility[] accessibilities;
    Location[] locations;
    Review[] reviews;
    Host[] hosts;
    CancellationPolicyHouseRule[] cancellationPolicyHouseRules;
    OtherHighlyRatedHome[] otherHighlyRatedHomes;
    ThingsToDo[] thingsToDos;

    public AirbnbProperty(Property[] properties, GuestSuite[] guestSuites, Amenity[] amenites, Accessibility[] accessibilities, Location[] locations, Review[] reviews, Host[] hosts, CancellationPolicyHouseRule[] cancellationPolicyHouseRules, OtherHighlyRatedHome[] otherHighlyRatedHomes, ThingsToDo[] thingsToDos) {
        this.properties = properties;
        this.guestSuites = guestSuites;
        this.amenities = amenites;
        this.accessibilities = accessibilities;
        this.locations = locations;
        this.reviews = reviews;
        this.hosts = hosts;
        this.cancellationPolicyHouseRules = cancellationPolicyHouseRules;
        this.otherHighlyRatedHomes = otherHighlyRatedHomes;
        this.thingsToDos = thingsToDos;
    }

    public Property[] getProperties() {
        return this.properties;
    }

    public void setProperties(Property[] properties) {
        this.properties = properties;
    }

    public GuestSuite[] getGuestSuites() {
        return this.guestSuites;
    }

    public void setGuestSuites(GuestSuite[] guestSuites) {
        this.guestSuites = guestSuites;
    }

    public Amenity[] getAmenites() {
        return this.amenities;
    }

    public void setAmenites(Amenity[] amenites) {
        this.amenities = amenites;
    }

    public Accessibility[] getAccessibilities() {
        return this.accessibilities;
    }

    public void setAccessibilities(Accessibility[] accessibilities) {
        this.accessibilities = accessibilities;
    }

    public Location[] getLocations() {
        return this.locations;
    }

    public void setLocations(Location[] locations) {
        this.locations = locations;
    }

    public Review[] getReviews() {
        return this.reviews;
    }

    public void setReviews(Review[] reviews) {
        this.reviews = reviews;
    }

    public Host[] getHosts() {
        return this.hosts;
    }

    public void setHosts(Host[] hosts) {
        this.hosts = hosts;
    }

    public CancellationPolicyHouseRule[] getCancellationPolicyHouseRules() {
        return this.cancellationPolicyHouseRules;
    }

    public void setCancellationPolicyHouseRules(CancellationPolicyHouseRule[] cancellationPolicyHouseRules) {
        this.cancellationPolicyHouseRules = cancellationPolicyHouseRules;
    }

    public OtherHighlyRatedHome[] getOtherHighlyRatedHomes() {
        return this.otherHighlyRatedHomes;
    }

    public void setOtherHighlyRatedHomes(OtherHighlyRatedHome[] otherHighlyRatedHomes) {
        this.otherHighlyRatedHomes = otherHighlyRatedHomes;
    }

    public ThingsToDo[] getThingsToDos() {
        return this.thingsToDos;
    }

    public void setThingsToDos(ThingsToDo[] thingsToDos) {
        this.thingsToDos = thingsToDos;
    }

}