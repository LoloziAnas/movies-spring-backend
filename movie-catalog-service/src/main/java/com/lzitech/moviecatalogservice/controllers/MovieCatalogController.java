package com.lzitech.moviecatalogservice.controllers;

import com.lzitech.moviecatalogservice.models.CatalogItem;
import com.lzitech.moviecatalogservice.models.Movie;
import com.lzitech.moviecatalogservice.models.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

    @Autowired
    private RestTemplate restTemplate;

    
    @RequestMapping("{userId}")
    public Collection<CatalogItem> getCatalog(@PathVariable("userId") Long userId){
        UserRating ratings = restTemplate.getForObject("http://ratings-data-service/ratings/users/"+userId, UserRating.class);
        //assert ratings != null;
        return  ratings.getUserRatings().stream().map(rating -> {
            Movie movie = restTemplate.getForObject("http://movie-info-service/movies/"+rating.getMovieId(), Movie.class);
            assert movie != null;
            return new CatalogItem(movie.getName(), movie.getDescription(), rating.getRating());
        }).collect(Collectors.toList());
    }
}
