package com.Sakila.api.sakila.microservice;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ActorRepository extends JpaRepository<Actor, Integer> {}