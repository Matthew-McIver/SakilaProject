package com.Sakila.api.SakilaMicroservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Integer> {


}
