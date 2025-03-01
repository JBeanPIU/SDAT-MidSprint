package com.example.demo.model;

// imported jakarta instead of javax due to syntax errors on my end
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

/* ========================================================== */
/**
 * Passenger class for helping people book flights, keeps track of their name and phone number
 */
@Entity  // mark as JPA entity
@Data // generate the mutator/accessors, toString, any hashCode and equals
@NoArgsConstructor // generates a default constructor, to reduce code size
public class Passenger {
    @Id  // pk
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // auto-gen ID
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
}
