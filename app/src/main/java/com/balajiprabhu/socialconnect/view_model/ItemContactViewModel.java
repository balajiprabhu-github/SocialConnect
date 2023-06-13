package com.balajiprabhu.socialconnect.view_model;

public class ItemContactViewModel {

    public int contactType;
    public int profilePicId;
    public int availabilityStatusResId;
    public String name;
    public String viberId;
    public String lastSeenTime;
    public String email;


    public int getContactType() {
        return contactType;
    }

    public void setContactType(int contactType) {
        this.contactType = contactType;
    }

    public int getProfilePicId() {
        return profilePicId;
    }

    public void setProfilePicId(int profilePicId) {
        this.profilePicId = profilePicId;
    }

    public int getAvailabilityStatusResId() {
        return availabilityStatusResId;
    }

    public void setAvailabilityStatusResId(int availabilityStatusResId) {
        this.availabilityStatusResId = availabilityStatusResId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getViberId() {
        return viberId;
    }

    public void setViberId(String viberId) {
        this.viberId = viberId;
    }

    public String getLastSeenTime() {
        return lastSeenTime;
    }

    public void setLastSeenTime(String lastSeenTime) {
        this.lastSeenTime = lastSeenTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
