package com.example.demo.service;

import com.example.demo.model.Airport;
import com.example.demo.model.City;
import com.example.demo.repository.CityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/* ========================================================== */
@Service
// the point of this class is to contain methods for data fetching based on defined queries, and sends it to the controllers
public class CityService {

    @Autowired
    private CityRepo cityRepo;

    // fetches all airports for a specific city
    public List<Airport> getAirportsForCity(Long cityId) {
        return cityRepo.findAirportsByCityId(cityId);
    }
}

