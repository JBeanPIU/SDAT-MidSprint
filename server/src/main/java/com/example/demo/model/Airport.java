package com.example.demo.model;

// imported jakarta instead of javax due to syntax errors on my end
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

/**
 * An airport class to store info on aircraft and where they travel
 */
@Entity  // JPA entity
public class Airport {
    @Id  // pk
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // auto-increment ID
    private Long id;
    private String name;  // name of the airport
    private String code;  // signifies a unique airport code (like YYZ for Toronto Pearson for example)
}
