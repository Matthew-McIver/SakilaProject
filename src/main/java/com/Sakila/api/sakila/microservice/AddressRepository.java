package com.Sakila.api.sakila.microservice;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AddressRepository extends JpaRepository<Address, Integer> {}