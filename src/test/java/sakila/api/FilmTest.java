package sakila.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FilmTest {

    Film testFilm = new Film();

    Film newFilm = new Film("The Godfather", "A mafia film", 1972, "18");

    @Test
    void testFilmId(){
        testFilm.setFilmId(1);
        Assertions.assertEquals(1, testFilm.getFilmId(), "Setter and/or getter for film IDs is incorrect.");
    }

    @Test
    void testFilmTitle(){
        testFilm.setFilmTitle("The Godfather");
        Assertions.assertEquals("The Godfather", testFilm.getFilmTitle(), "Setter and/or getter for film titles is incorrect.");
    }

    @Test
    void testFilmDescription(){
        testFilm.setFilmDescription("A mafia film");
        Assertions.assertEquals("A mafia film", testFilm.getFilmDescription(), "Setter and/or getter for film descriptions is incorrect.");
    }

    @Test
    void testFilmReleaseYear(){
        testFilm.setReleaseYear(1972);
        Assertions.assertEquals(1972, testFilm.getReleaseYear(), "Setter and/or getter for release years is incorrect.");
    }

    @Test
    void testFilmAgeRating(){
        testFilm.setAgeRating("18");
        Assertions.assertEquals("18", testFilm.getAgeRating(), "Setter and/or getter for age ratings is incorrect.");
    }
}
