package com.example.airbnb.entities;

/**
 * Language
 */
public class Language {

    boolean isAll;
    boolean isEnglish;
    boolean isDeutsch;
    boolean isSpanish;
    boolean isFrench;

    public Language(boolean isAll, boolean isEnglish, boolean isDeutsch, boolean isSpanish, boolean isFrench) {
        this.isAll = isAll;
        this.isEnglish = isEnglish;
        this.isDeutsch = isDeutsch;
        this.isSpanish = isSpanish;
        this.isFrench = isFrench;
    }

    public boolean isIsAll() {
        return this.isAll;
    }

    public boolean getIsAll() {
        return this.isAll;
    }

    public void setIsAll(boolean isAll) {
        this.isAll = isAll;
    }

    public boolean isIsEnglish() {
        return this.isEnglish;
    }

    public boolean getIsEnglish() {
        return this.isEnglish;
    }

    public void setIsEnglish(boolean isEnglish) {
        this.isEnglish = isEnglish;
    }

    public boolean isIsDeutsch() {
        return this.isDeutsch;
    }

    public boolean getIsDeutsch() {
        return this.isDeutsch;
    }

    public void setIsDeutsch(boolean isDeutsch) {
        this.isDeutsch = isDeutsch;
    }

    public boolean isIsSpanish() {
        return this.isSpanish;
    }

    public boolean getIsSpanish() {
        return this.isSpanish;
    }

    public void setIsSpanish(boolean isSpanish) {
        this.isSpanish = isSpanish;
    }

    public boolean isIsFrench() {
        return this.isFrench;
    }

    public boolean getIsFrench() {
        return this.isFrench;
    }

    public void setIsFrench(boolean isFrench) {
        this.isFrench = isFrench;
    }

}