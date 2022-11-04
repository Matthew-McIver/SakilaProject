package com.Sakila.api.sakila.microservice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    @Query(nativeQuery = true,
    value = "SELECT DISTINCT * FROM customer WHERE first_name = ?1 AND last_name = ?2")
    Customer getCustomerByName(String firstName, String lastName); }