package com.lzitech.moviecatalogservice.controllers;

import com.lzitech.moviecatalogservice.models.CatalogItem;
import com.lzitech.moviecatalogservice.models.Movie;
import com.lzitech.moviecatalogservice.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

    @RequestMapping("{userId}")
    public Collection<CatalogItem> getCatalog(@PathVariable("userId") Long userId){
        RestTemplate restTemplate = new RestTemplate();
        List<Rating> ratings = Arrays.asList(
                new Rating(1L,2),
                new Rating(2L,8),
                new Rating(3L,6)
        );
        return  ratings.stream().map(rating -> {
            Movie movie = restTemplate.getForObject("http://localhost:8082/movies/1", Movie.class);
            assert movie != null;
            return new CatalogItem(movie.getName(), "desc 1", rating.getRating());
        }).collect(Collectors.toList());
    }
}
