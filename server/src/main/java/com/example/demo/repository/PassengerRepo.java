package com.example.demo.repository;

import com.example.demo.model.Aircraft;
import com.example.demo.model.Airport;
import com.example.demo.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

/* ========================================================== */
// purpose of repo classes is to allow db operations like saving, updating, etc. without making complex SQL queries manually lol
public interface PassengerRepo extends JpaRepository<Passenger, Long> {
    // query to extract all aircraft a passenger has traveled on
    @Query("SELECT a FROM Aircraft a JOIN a.passengers p WHERE p.id = :passengerId")
    List<Aircraft> findAircraftsByPassId(@Param("passengerId") Long passengerId);

    // this query is used to get amount of airports a passenger has used
    @Query("SELECT a FROM Airport a JOIN a.passengers p WHERE p.id = :passengerId")
    List<Airport> findAirportsByPassId(@Param("passengerId") Long passengerId);

    List<Aircraft> findAircraftsByPassengerId(Long passengerId);

    List<Airport> findAirportsByPassengerId(Long passengerId);
}
