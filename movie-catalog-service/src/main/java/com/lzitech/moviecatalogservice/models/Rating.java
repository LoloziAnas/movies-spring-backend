package com.lzitech.moviecatalogservice.models;

public class Rating {

    private Long movieId;
    private Integer rating;

    public Rating() {
    }

    public Rating(Long movieId, Integer rating) {
        this.movieId = movieId;
        this.rating = rating;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
