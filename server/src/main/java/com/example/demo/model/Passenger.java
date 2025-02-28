package com.example.demo.model;

// imported jakarta instead of javax due to syntax errors on my end
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

/**
 * Passenger class for helping people book flights, keeps track of their name and phone number
 */
@Entity  // mark as JPA entity
public class Passenger {
    @Id  // pk
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // auto-gen ID
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
}
