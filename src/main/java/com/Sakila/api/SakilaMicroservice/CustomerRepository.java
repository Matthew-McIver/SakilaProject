package com.Sakila.api.SakilaMicroservice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.Optional;
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    @Query(nativeQuery = true,
    value = "SELECT * FROM customer WHERE first_name = ?1")
    Optional<Customer> getCustomerByFirstName(String firstName); }