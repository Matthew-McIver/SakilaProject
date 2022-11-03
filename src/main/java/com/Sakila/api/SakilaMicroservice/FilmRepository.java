package com.Sakila.api.SakilaMicroservice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
public interface FilmRepository extends JpaRepository<Film, Integer> {
    @Query(nativeQuery = true,
    value = "SELECT * FROM sakila.film ORDER BY rand() LIMIT 10")
    List<Film> getRandomFilms(); }