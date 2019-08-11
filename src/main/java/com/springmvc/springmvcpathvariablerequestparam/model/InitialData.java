package com.springmvc.springmvcpathvariablerequestparam.model;

import java.util.*;

/**
 * Created by Metin on 11.08.2019.
 */

public class InitialData {

    private List<Movie> movies = new ArrayList<>();

    public InitialData() {
        List<Star> starsForFightClub = Arrays.asList(
                new Star(1L, "Brad", "Pitt", 50),
                new Star(2L, "Edward", "Norton", 48),
                new Star(3L, "Meat", "Loaf", 45)
        );

        List<Star> starsForSaw = Arrays.asList(
                new Star(4L, "Cary", "Elwes", 55),
                new Star(5L, "Leigh", "Whannell", 48),
                new Star(6L, "Danny", "Glover", 43)
        );

        movies.add(new Movie(1L, "Fight Club", "ABD", "1999", "David Fincher", starsForFightClub));
        movies.add(new Movie(2L, "Saw", "ABD", "2004", "James Wan", starsForSaw));
    }

    public List<Movie> getMovies() {
        return movies;
    }
}