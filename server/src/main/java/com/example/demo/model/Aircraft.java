package com.example.demo.model;

// imported jakarta instead of javax due to syntax errors on my end
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Aircraft that allows Passengers to travel
 */
@Entity  // defines this class as a database entity
@Data // generate the mutator/accessors, toString, any hashCode and equals
@NoArgsConstructor // generates a default constructor, to reduce code size
public class Aircraft {
    @Id  // pk
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // auto-gen ID
    private Long id;
    private String type;  // type of aircraft
    private String airlineName;  // company that owns airline
    private int numberOfPassengers;
}

