package com.lzitech.movieinfoservice.Controllers;

import com.lzitech.movieinfoservice.models.Movie;
import com.lzitech.movieinfoservice.models.MovieSummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    //@Value("${api.key}")
    private static String apiKey="c8ee90f79d14de718ff923908140e0a7";

    @RequestMapping("{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") Long movieId){
        MovieSummary movieSummary = restTemplate.getForObject("https://api.themoviedb.org/3/movie/"+movieId+"?api_key="+apiKey, MovieSummary.class);
        return  new Movie(movieId,movieSummary.getTitle(),movieSummary.getOverview());
    }
}
