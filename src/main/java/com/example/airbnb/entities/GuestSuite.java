package com.example.airbnb.entities;

/**
 * GuestSuite
 */
public class GuestSuite {

    String roomTypeImageUrl;
    String roomType;
    boolean isDoubleBed;
    boolean isSingleBed;
    boolean isTwinBed;
    boolean isKingBed;
    boolean isQueenBed;

    public GuestSuite(String roomTypeImageUrl, String roomType, boolean isDoubleBed, boolean isSingleBed, boolean isTwinBed, boolean isKingBed, boolean isQueenBed) {
        this.roomTypeImageUrl = roomTypeImageUrl;
        this.roomType = roomType;
        this.isDoubleBed = isDoubleBed;
        this.isSingleBed = isSingleBed;
        this.isTwinBed = isTwinBed;
        this.isKingBed = isKingBed;
        this.isQueenBed = isQueenBed;
    }

    public String getRoomTypeImageUrl() {
        return this.roomTypeImageUrl;
    }

    public void setRoomTypeImageUrl(String roomTypeImageUrl) {
        this.roomTypeImageUrl = roomTypeImageUrl;
    }

    public String getRoomType() {
        return this.roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isIsDoubleBed() {
        return this.isDoubleBed;
    }

    public boolean getIsDoubleBed() {
        return this.isDoubleBed;
    }

    public void setIsDoubleBed(boolean isDoubleBed) {
        this.isDoubleBed = isDoubleBed;
    }

    public boolean isIsSingleBed() {
        return this.isSingleBed;
    }

    public boolean getIsSingleBed() {
        return this.isSingleBed;
    }

    public void setIsSingleBed(boolean isSingleBed) {
        this.isSingleBed = isSingleBed;
    }

    public boolean isIsTwinBed() {
        return this.isTwinBed;
    }

    public boolean getIsTwinBed() {
        return this.isTwinBed;
    }

    public void setIsTwinBed(boolean isTwinBed) {
        this.isTwinBed = isTwinBed;
    }

    public boolean isIsKingBed() {
        return this.isKingBed;
    }

    public boolean getIsKingBed() {
        return this.isKingBed;
    }

    public void setIsKingBed(boolean isKingBed) {
        this.isKingBed = isKingBed;
    }

    public boolean isIsQueenBed() {
        return this.isQueenBed;
    }

    public boolean getIsQueenBed() {
        return this.isQueenBed;
    }

    public void setIsQueenBed(boolean isQueenBed) {
        this.isQueenBed = isQueenBed;
    }

}