package com.example.demo.model;

// imported jakarta instead of javax due to syntax errors on my end
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

/**
 * This class is designed to represent cities that hold airports
 */
@Entity  // @entity marks class as a JPA entity (which is linked to a database table)
public class City {
    @Id  // marking field as primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // auto-gen ID value
    private Long id;
    private String name;
    private String state;
    private int population;
}
