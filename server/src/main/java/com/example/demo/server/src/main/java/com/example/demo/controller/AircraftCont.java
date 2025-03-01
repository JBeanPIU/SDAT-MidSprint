package com.example.demo.controller;

import com.example.demo.service.AircraftService;
import com.example.demo.model.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// a class responsible for handling HTTP requests & providing responses, that can be interacted with by the client
@RestController
@RequestMapping("/aircrafts")
public class AircraftCont {

    @Autowired
    private AircraftService aircraftService;

    // Endpoint to get airports an aircraft has taken off from and landed at
    @GetMapping("/{aircraftId}/airports")
    public List<Airport> getAirportsForAircraft(@PathVariable Long aircraftId) {
        return aircraftService.getAirportsForAircraft(aircraftId);
    }
}
