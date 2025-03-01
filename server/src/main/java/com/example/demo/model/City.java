package com.example.demo.model;

// imported jakarta instead of javax due to syntax errors on my end
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

/* ========================================================== */
/**
 * This class is designed to represent cities that hold airports
 */
@Entity  // @entity marks class as a JPA entity (which is linked to a database table)
@Data // generate the mutator/accessors, toString, any hashCode and equals
@NoArgsConstructor // generates a default constructor, to reduce code size
public class City {
    @Id  // marking field as primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // auto-gen ID value
    private Long id;
    private String name;
    private String state;
    private int population;
}
