package com.example.airbnb.entities;

/**
 * Property
 */
public class Property {
	
	String propertyName;
	String propertyImageUrl;
	int guestNum;
	int privateBedroomNum;
	int bedNum;
	int privateBathNum;
	String propertyDescription;
	String hostImageUrl;
	String hostName;

	public Property(String propertyName, String propertyImageUrl, int guestNum, int privateBedroomNum, int bedNum, int privateBathNum, String propertyDescription, String hostImageUrl, String hostName) {
		this.propertyName = propertyName;
		this.propertyImageUrl = propertyImageUrl;
		this.guestNum = guestNum;
		this.privateBedroomNum = privateBedroomNum;
		this.bedNum = bedNum;
		this.privateBathNum = privateBathNum;
		this.propertyDescription = propertyDescription;
		this.hostImageUrl = hostImageUrl;
		this.hostName = hostName;
	}

	public String getPropertyName() {
		return this.propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getPropertyImageUrl() {
		return this.propertyImageUrl;
	}

	public void setPropertyImageUrl(String propertyImageUrl) {
		this.propertyImageUrl = propertyImageUrl;
	}

	public int getGuestNum() {
		return this.guestNum;
	}

	public void setGuestNum(int guestNum) {
		this.guestNum = guestNum;
	}

	public int getPrivateBedroomNum() {
		return this.privateBedroomNum;
	}

	public void setPrivateBedroomNum(int privateBedroomNum) {
		this.privateBedroomNum = privateBedroomNum;
	}

	public int getBedNum() {
		return this.bedNum;
	}

	public void setBedNum(int bedNum) {
		this.bedNum = bedNum;
	}

	public int getPrivateBathNum() {
		return this.privateBathNum;
	}

	public void setPrivateBathNum(int privateBathNum) {
		this.privateBathNum = privateBathNum;
	}

	public String getPropertyDescription() {
		return this.propertyDescription;
	}

	public void setPropertyDescription(String propertyDescription) {
		this.propertyDescription = propertyDescription;
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

}