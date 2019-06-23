package com.example.airbnb.entities;

/**
 * OtherHighlyRatedHome
 */
public class OtherHighlyRatedHome {
	
	String propertyImageUrl;
	boolean isPlus;
	boolean isVerified;
	String location;
	String propertyName;
	int pricePerNight;
	double ratingStars;
	int reviewsCount;

	public OtherHighlyRatedHome(String propertyImageUrl, boolean isPlus, boolean isVerified, String location, String propertyName, int pricePerNight, double ratingStars, int reviewsCount) {
		this.propertyImageUrl = propertyImageUrl;
		this.isPlus = isPlus;
		this.isVerified = isVerified;
		this.location = location;
		this.propertyName = propertyName;
		this.pricePerNight = pricePerNight;
		this.ratingStars = ratingStars;
		this.reviewsCount = reviewsCount;
	}

	public String getPropertyImageUrl() {
		return this.propertyImageUrl;
	}

	public void setPropertyImageUrl(String propertyImageUrl) {
		this.propertyImageUrl = propertyImageUrl;
	}

	public boolean isIsPlus() {
		return this.isPlus;
	}

	public boolean getIsPlus() {
		return this.isPlus;
	}

	public void setIsPlus(boolean isPlus) {
		this.isPlus = isPlus;
	}

	public boolean isIsVerified() {
		return this.isVerified;
	}

	public boolean getIsVerified() {
		return this.isVerified;
	}

	public void setIsVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPropertyName() {
		return this.propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public int getPricePerNight() {
		return this.pricePerNight;
	}

	public void setPricePerNight(int pricePerNight) {
		this.pricePerNight = pricePerNight;
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
	
}