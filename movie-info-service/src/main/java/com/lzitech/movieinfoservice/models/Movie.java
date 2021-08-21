package com.lzitech.movieinfoservice.models;

public class Movie {
    private Long movieId;
    private String name;

    public Movie() {

    }
    public Movie(Long movieId, String name) {
        this.movieId = movieId;
        this.name = name;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
