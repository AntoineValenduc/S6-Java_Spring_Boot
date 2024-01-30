package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity()
@Table(name = "Temperature")
@Data
public class Temperature {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "celsius")
    private double celsius;

    @Column(name = "fahrenheit ")
    private double fahrenheit;

    @Column(name = "kelvin ")
    private double kelvin;
}
