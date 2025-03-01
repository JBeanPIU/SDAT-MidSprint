package com.example.demo.service;

import com.example.demo.model.Aircraft;
import com.example.demo.model.Airport;
import com.example.demo.repository.AircraftRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/* ========================================================== */
@Service
// the point of this class is to contain methods for data fetching based on defined queries, and sends it to the controllers
public class AircraftService {

    @Autowired
    private AircraftRepo aircraftRepo;

    // gets all airports that have an aircraft which has been used for takeoff and landing (better description)
    public List<Airport> getAirportsForAircraft(Long aircraftId) {
        return aircraftRepo.findAirportsByAircraftId(aircraftId);
    }
}

