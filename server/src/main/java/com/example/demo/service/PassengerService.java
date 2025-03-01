package com.example.demo.service;

import com.example.demo.model.Aircraft;
import com.example.demo.model.Airport;
import com.example.demo.repository.PassengerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/* ========================================================== */
@Service
public class PassengerService {

    @Autowired
    private PassengerRepo passengerRepo;

    // gets all aircraft a passenger has traveled on
    public List<Aircraft> getAircraftForPassenger(Long passengerId) {
        return passengerRepo.findAircraftsByPassengerId(passengerId);
    }

    // gets all airports that a passenger has used (airplane count)
    public List<Airport> getAirportsForPassenger(Long passengerId) {
        return passengerRepo.findAirportsByPassengerId(passengerId);
    }
}

