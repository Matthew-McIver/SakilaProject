package com.akila.api.sakila.microservice;
import org.springframework.data.jpa.repository.JpaRepository;
public interface RentalRepository extends JpaRepository<Rental, Integer> {}