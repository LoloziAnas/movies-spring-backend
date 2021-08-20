package com.lzitech.moviecatalogservice.models;

public class CatalogItem {
    private Long id;
    private String name;
    private String desc;
    private Integer ratings;

    public CatalogItem(String name, String desc, Integer ratings) {
        this.name = name;
        this.desc = desc;
        this.ratings = ratings;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getRatings() {
        return ratings;
    }

    public void setRatings(Integer ratings) {
        this.ratings = ratings;
    }
}
