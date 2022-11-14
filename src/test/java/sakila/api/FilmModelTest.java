package sakila.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FilmModelTest {
    FilmModel testFilm = new FilmModel("The Godfather", "A mafia film.", 1972, "18");
    @Test
    void testFilmTitle(){
        Assertions.assertEquals("The Godfather", testFilm.getFilmTitle(), "Getter for film title is incorrect."); }
    @Test
    void testFilmDescription(){
        Assertions.assertEquals("A mafia film.", testFilm.getFilmDescription(), "Getter for film description is incorrect."); }
    @Test
    void testFilmYear(){
        Assertions.assertEquals(1972, testFilm.getFilmYear(), "Getter for film release year is incorrect."); }
    @Test
    void testFilmRating(){
        Assertions.assertEquals("18", testFilm.getFilmRating(), "Getter for film rating is incorrect."); }}