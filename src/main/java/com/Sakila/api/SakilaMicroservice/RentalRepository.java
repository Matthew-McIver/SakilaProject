package com.Sakila.api.SakilaMicroservice;
import org.springframework.data.jpa.repository.JpaRepository;
public interface RentalRepository extends JpaRepository<Rental, Integer> {}