package com.example.demo.model;

// imported jakarta instead of javax due to syntax errors on my end
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * An airport class to store info on aircraft and where they travel
 */
@Entity  // JPA entity
@Data // generate the mutator/accessors, toString, any hashCode and equals
@NoArgsConstructor // generates a default constructor, to reduce code size
public class Airport {
    @Id  // pk
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // auto-increment ID
    private Long id;
    private String name;  // name of the airport
    private String code;  // signifies a unique airport code (like YYZ for Toronto Pearson for example)
}
