package com.example.demo.repository;

import com.example.demo.model.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/* ========================================================== */
// purpose of repo classes is to allow db operations like saving, updating, etc. without making complex SQL queries manually lol
public interface AirportRepo extends JpaRepository<Airport, Long> {
    // query to find all airports by city
    List<Airport> findByCityId(Long cityId);
}
