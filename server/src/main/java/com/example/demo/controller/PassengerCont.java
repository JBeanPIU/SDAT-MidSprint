package com.example.demo.controller;

import com.example.demo.service.PassengerService;
import com.example.demo.model.Aircraft;
import com.example.demo.model.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/* ========================================================== */
// a class responsible for handling HTTP requests & providing responses, that can be interacted with by the client
@RestController
@RequestMapping("/passengers")
public class PassengerCont {

    /* ====================== */
    @Autowired
    private PassengerService passengerService;

    @GetMapping("/{passengerId}/aircrafts")     // final request getting all aircraft that a passenger has traveled on
    public List<Aircraft> getAircraftForPassenger(@PathVariable Long passengerId) {
        return passengerService.getAircraftForPassenger(passengerId);
    }

    @GetMapping("/{passengerId}/airports")    // final request nabbing all airports that a passenger has used
    public List<Airport> getAirportsForPassenger(@PathVariable Long passengerId) {
        return passengerService.getAirportsForPassenger(passengerId);
    }
}
