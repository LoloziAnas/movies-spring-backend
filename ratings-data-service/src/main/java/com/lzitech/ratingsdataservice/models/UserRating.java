package com.lzitech.ratingsdataservice.models;

import java.util.List;

public class UserRating {
    private List<Rating> userRatings;

    public  UserRating(){

    }
    public List<Rating> getUserRatings() {
        return userRatings;
    }

    public void setUserRatings(List<Rating> userRatings) {
        this.userRatings = userRatings;
    }
}
