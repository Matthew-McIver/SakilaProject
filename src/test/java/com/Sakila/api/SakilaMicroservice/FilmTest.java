package com.Sakila.api.SakilaMicroservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmTest {

    Film testFilm = new Film();

    @Test
    public void testFilmId(){
        testFilm.setFilmId(1);
        Assertions.assertEquals(1, testFilm.getFilmId(), "Setter and/or getter for film IDs is incorrect.");
    }

    @Test
    public void testFilmTitle(){
        testFilm.setFilmTitle("Transformers 6: Why do we keep making these");
        Assertions.assertEquals("Transformers 6: Why do we keep making these", testFilm.getFilmTitle(), "Setter and/or getter for film titles is incorrect.");
    }

    @Test
    public void testFilmDescription(){
        testFilm.setFilmDescription("It is bad");
        Assertions.assertEquals("It is bad", testFilm.getFilmDescription(), "Setter and/or getter for film descriptions is incorrect.");
    }

    @Test
    public void testFilmReleaseYear(){
        testFilm.setReleaseYear(2001);
        Assertions.assertEquals(2001, testFilm.getReleaseYear(), "Setter and/or getter for release years is incorrect.");
    }

    @Test
    public void testFilmAgeRating(){
        testFilm.setAgeRating("18");
        Assertions.assertEquals("18", testFilm.getAgeRating(), "Setter and/or getter for age ratings is incorrect.");
    }

    @Test
    public void testConstructorFilm(){
        Film newTestFilm = new Film();
    }
}
