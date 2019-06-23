package com.example.airbnb.entities;

/**
 * Host
 */
public class Host {
	String hostImageUrl;
	String hostName;
	String bio;
	boolean isOnProperty;
	boolean isAvailability;
	String joinDate;
	Language[] languages;
	int responseRate;
	String responseTime;

	public Host(String hostImageUrl, String hostName, String bio, boolean isOnProperty, boolean isAvailability, String joinDate, Language[] languages, int responseRate, String responseTime) {
		this.hostImageUrl = hostImageUrl;
		this.hostName = hostName;
		this.bio = bio;
		this.isOnProperty = isOnProperty;
		this.isAvailability = isAvailability;
		this.joinDate = joinDate;
		this.languages = languages;
		this.responseRate = responseRate;
		this.responseTime = responseTime;
	}

	public String getHostImageUrl() {
		return this.hostImageUrl;
	}

	public void setHostImageUrl(String hostImageUrl) {
		this.hostImageUrl = hostImageUrl;
	}

	public String getHostName() {
		return this.hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getBio() {
		return this.bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public boolean isIsOnProperty() {
		return this.isOnProperty;
	}

	public boolean getIsOnProperty() {
		return this.isOnProperty;
	}

	public void setIsOnProperty(boolean isOnProperty) {
		this.isOnProperty = isOnProperty;
	}

	public boolean isIsAvailability() {
		return this.isAvailability;
	}

	public boolean getIsAvailability() {
		return this.isAvailability;
	}

	public void setIsAvailability(boolean isAvailability) {
		this.isAvailability = isAvailability;
	}

	public String getJoinDate() {
		return this.joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	public Language[] getLanguages() {
		return this.languages;
	}

	public void setLanguages(Language[] languages) {
		this.languages = languages;
	}

	public int getResponseRate() {
		return this.responseRate;
	}

	public void setResponseRate(int responseRate) {
		this.responseRate = responseRate;
	}

	public String getResponseTime() {
		return this.responseTime;
	}

	public void setResponseTime(String responseTime) {
		this.responseTime = responseTime;
	}

}