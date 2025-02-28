package com.example.demo.repository;

import com.example.demo.model.Airport;
import com.example.demo.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepo extends JpaRepository<City, Long> {
    // custom query to obtain all airports in a specific city
    List<Airport> findAirportsByCityId(Long cityId);
}
