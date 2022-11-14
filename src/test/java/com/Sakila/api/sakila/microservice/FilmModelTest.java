package com.Sakila.api.sakila.microservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmModelTest {
    FilmModel testFilm = new FilmModel("The Godfather", "A mafia film.", 1972, "18");
    @Test
    public void testFilmTitle(){
        Assertions.assertEquals("The Godfather", testFilm.getFilmTitle(), "Getter for film title is incorrect."); }
    @Test
    public void testFilmDescription(){
        Assertions.assertEquals("A mafia film.", testFilm.getFilmDescription(), "Getter for film description is incorrect."); }
    @Test
    public void testFilmYear(){
        Assertions.assertEquals(1972, testFilm.getFilmYear(), "Getter for film release year is incorrect."); }
    @Test
    public void testFilmRating(){
        Assertions.assertEquals("18", testFilm.getFilmRating(), "Getter for film rating is incorrect."); }}