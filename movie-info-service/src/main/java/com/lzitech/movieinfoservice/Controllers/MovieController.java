package com.lzitech.movieinfoservice.Controllers;

import com.lzitech.movieinfoservice.models.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @RequestMapping("{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") Long movieId){
        return  new Movie(1L,"Into the wild");
    }
}
