package com.example.demo.controller;

import com.example.demo.service.CityService;
import com.example.demo.model.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/* ========================================================== */
// a class responsible for handling HTTP requests & providing responses, that can be interacted with by the client
@RestController
@RequestMapping("/cities")
public class CityCont {

    /* ====================== */
    @Autowired
    private CityService cityService;

    // endpoint getting all airports for a specific city
    @GetMapping("/{cityId}/airports")
    public List<Airport> getAirportsForCity(@PathVariable Long cityId) {
        return cityService.getAirportsForCity(cityId);
    }
}

