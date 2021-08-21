package com.lzitech.ratingsdataservice.controllers;

import com.lzitech.ratingsdataservice.models.Rating;
import com.lzitech.ratingsdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {
    @RequestMapping("{movieId}")
    public Rating getRating(@PathVariable("movieId") Long movieId){
        return new Rating(movieId,5);
    }
    @RequestMapping("/users/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") Long userId){
        List<Rating> ratings = Arrays.asList(
                new Rating(1L,2),
                new Rating(2L,8),
                new Rating(3L,6)
        );
        UserRating userRating = new UserRating();
        userRating.setUserRatings(ratings);
        return userRating;
    }
}
