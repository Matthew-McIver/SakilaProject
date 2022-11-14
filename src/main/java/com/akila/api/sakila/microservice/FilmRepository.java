package com.akila.api.sakila.microservice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
public interface FilmRepository extends JpaRepository<Film, Integer> {
    @Query(nativeQuery = true,
    value = "SELECT * FROM sakila.film ORDER BY rand() LIMIT ?1")
    List<Film> getRandomFilms(int noOfFilms);

    @Query(nativeQuery = true,
    value = "SELECT * FROM sakila.film WHERE title = ?1 LIMIT 1")
    Film getFilmByName(String filmName);
}
