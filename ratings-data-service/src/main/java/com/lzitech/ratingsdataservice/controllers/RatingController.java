package com.lzitech.ratingsdataservice.controllers;

import com.lzitech.ratingsdataservice.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ratings")
public class RatingController {
    @RequestMapping("{movieId}")
    public Rating getRating(@PathVariable("movieId") Long movieId){
        return new Rating(1L,5);
    }
}
