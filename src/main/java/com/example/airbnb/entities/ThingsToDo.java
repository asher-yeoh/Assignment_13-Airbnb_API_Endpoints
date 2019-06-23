package com.example.airbnb.entities;

/**
 * ThingsToDo
 */
public class ThingsToDo {

	String activityImageUrl;
	String activityCategory;
	String activityDescription;
	int pricePerPerson;
	double durationInHours;
	boolean isTransportation;
	boolean isFood;
	boolean isDrinks;
	boolean isEquipment;
	boolean isTicket;
	double ratingStars;
	int reviewsCount;
	String[] languages;

	public ThingsToDo(String activityImageUrl, String activityCategory, String activityDescription, int pricePerPerson, double durationInHours, boolean isTransportation, boolean isFood, boolean isDrinks, boolean isEquipment, boolean isTicket, double ratingStars, int reviewsCount, String[] languages) {
		this.activityImageUrl = activityImageUrl;
		this.activityCategory = activityCategory;
		this.activityDescription = activityDescription;
		this.pricePerPerson = pricePerPerson;
		this.durationInHours = durationInHours;
		this.isTransportation = isTransportation;
		this.isFood = isFood;
		this.isDrinks = isDrinks;
		this.isEquipment = isEquipment;
		this.isTicket = isTicket;
		this.ratingStars = ratingStars;
		this.reviewsCount = reviewsCount;
		this.languages = languages;
	}

	public String getActivityImageUrl() {
		return this.activityImageUrl;
	}

	public void setActivityImageUrl(String activityImageUrl) {
		this.activityImageUrl = activityImageUrl;
	}

	public String getActivityCategory() {
		return this.activityCategory;
	}

	public void setActivityCategory(String activityCategory) {
		this.activityCategory = activityCategory;
	}

	public String getActivityDescription() {
		return this.activityDescription;
	}

	public void setActivityDescription(String activityDescription) {
		this.activityDescription = activityDescription;
	}

	public int getPricePerPerson() {
		return this.pricePerPerson;
	}

	public void setPricePerPerson(int pricePerPerson) {
		this.pricePerPerson = pricePerPerson;
	}

	public double getDurationInHours() {
		return this.durationInHours;
	}

	public void setDurationInHours(double durationInHours) {
		this.durationInHours = durationInHours;
	}

	public boolean isIsTransportation() {
		return this.isTransportation;
	}

	public boolean getIsTransportation() {
		return this.isTransportation;
	}

	public void setIsTransportation(boolean isTransportation) {
		this.isTransportation = isTransportation;
	}

	public boolean isIsFood() {
		return this.isFood;
	}

	public boolean getIsFood() {
		return this.isFood;
	}

	public void setIsFood(boolean isFood) {
		this.isFood = isFood;
	}

	public boolean isIsDrinks() {
		return this.isDrinks;
	}

	public boolean getIsDrinks() {
		return this.isDrinks;
	}

	public void setIsDrinks(boolean isDrinks) {
		this.isDrinks = isDrinks;
	}

	public boolean isIsEquipment() {
		return this.isEquipment;
	}

	public boolean getIsEquipment() {
		return this.isEquipment;
	}

	public void setIsEquipment(boolean isEquipment) {
		this.isEquipment = isEquipment;
	}

	public boolean isIsTicket() {
		return this.isTicket;
	}

	public boolean getIsTicket() {
		return this.isTicket;
	}

	public void setIsTicket(boolean isTicket) {
		this.isTicket = isTicket;
	}

	public double getRatingStars() {
		return this.ratingStars;
	}

	public void setRatingStars(double ratingStars) {
		this.ratingStars = ratingStars;
	}

	public int getReviewsCount() {
		return this.reviewsCount;
	}

	public void setReviewsCount(int reviewsCount) {
		this.reviewsCount = reviewsCount;
	}

	public String[] getLanguages() {
		return this.languages;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}
	
}