package com.springmvc.springmvcpathvariablerequestparam.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Metin on 11.08.2019.
 */

public class Movie {

    private Long id;
    private String name;
    private String country;
    private String year;
    private String director;
    private List<Star> stars = new ArrayList<>();

    public Movie() {

    }

    public Movie(Long id, String name, String country, String year, String director, List<Star> stars) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.year = year;
        this.director = director;
        this.stars = stars;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<Star> getStars() {
        return stars;
    }

    public void setStars(List<Star> stars) {
        this.stars = stars;
    }
}
