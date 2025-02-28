package com.example.demo.repository;

import com.example.demo.model.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AirportRepo extends JpaRepository<Airport, Long> {
    // query to find all airports by city
    List<Airport> findByCityId(Long cityId);
}
