package com.springmvc.springmvcpathvariablerequestparam.controller;

import com.springmvc.springmvcpathvariablerequestparam.model.InitialData;
import com.springmvc.springmvcpathvariablerequestparam.model.Movie;
import com.springmvc.springmvcpathvariablerequestparam.model.Star;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Metin on 11.08.2019.
 */

@RestController
public class MovieController {

    private List<Movie> movies = new ArrayList<>();

    public MovieController() {
        InitialData initialData = new InitialData();
        movies = initialData.getMovies();
    }

    @GetMapping("/movies")
    public List<Movie> getMovie() {
        return movies;
    }

    @GetMapping("/movies/{movieId}")
    public Movie getMovie(@PathVariable("movieId") Long movieId) {
        Optional<Movie> movie = movies.stream().filter(t -> t.getId() == movieId).findFirst();
        if (movie.isPresent()) {
            return movie.get();
        }
        return null;
    }

    @GetMapping("/movies/{movieId}/stars")
    public List<Star> getStars(@PathVariable("movieId") Long movieId) {
        Optional<Movie> movie = movies.stream().filter(t -> t.getId() == movieId).findFirst();
        if (movie.isPresent()) {
            return movie.get().getStars();
        }
        return new ArrayList<>();
    }

    @GetMapping("/movies/{movieId}/stars/{starId}")
    public Star getStars(@PathVariable("movieId") Long movieId, @PathVariable("starId") Long starId) {
        Optional<Movie> movie = movies.stream().filter(t -> t.getId() == movieId).findFirst();
        if (movie.isPresent()) {
            Optional<Star> star = movie.get().getStars().stream().filter(x -> x.getId() == starId).findFirst();
            if (star.isPresent()) {
                return star.get();
            }
        }
        return null;
    }

    @GetMapping("/movies/search")
    public List<Movie> getMovie(@RequestParam(value = "name", required = false, defaultValue = "abc") String name,
                                @RequestParam(value = "country", required = false) String country,
                                @RequestParam(value = "year", required = false) String year,
                                @RequestParam(value = "director", required = false) String director) {
        List<Movie> movieList = new ArrayList<>(movies);

        if (name != null) {
            movieList = movieList.stream().filter(t -> t.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
        }
        if (country != null) {
            movieList = movieList.stream().filter(t -> t.getCountry().equalsIgnoreCase(country)).collect(Collectors.toList());
        }
        if (year != null) {
            movieList = movieList.stream().filter(t -> t.getYear().equalsIgnoreCase(year)).collect(Collectors.toList());
        }
        if (director != null) {
            movieList = movieList.stream().filter(t -> t.getDirector().equalsIgnoreCase(director)).collect(Collectors.toList());
        }

        return movieList;
    }
}