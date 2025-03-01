package com.example.demo.service;

import com.example.demo.model.Airport;
import com.example.demo.repository.AirportRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/* ========================================================== */
@Service
// the point of this class is to contain methods for data fetching based on defined queries, and sends it to the controllers
public class AirportService {

    @Autowired
    private AirportRepo airportRepo;

    // gets airports by city
    public List<Airport> getAirportsByCity(Long cityId) {
        return airportRepo.findByCityId(cityId);
    }
}
