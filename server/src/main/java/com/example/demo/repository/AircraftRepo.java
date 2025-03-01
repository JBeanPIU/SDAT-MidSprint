package com.example.demo.repository;

import com.example.demo.model.Aircraft;
import com.example.demo.model.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/* ========================================================== */
// purpose of repo classes is to allow db operations like saving, updating, etc. without making complex SQL queries manually lol
public interface AircraftRepo extends JpaRepository<Aircraft, Long> {
    // query to get airports an aircraft to travel in their direction (one airport to another, awful explanation lol)
    @Query("SELECT a FROM Airport a JOIN a.aircrafts ac WHERE ac.id = :aircraftId")
    List<Airport> findAirportsByAircraftId(@Param("aircraftId") Long aircraftId);
}
