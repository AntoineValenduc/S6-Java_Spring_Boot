package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
/**
 * DTO utilisé dans la requête POST 'convertTemperature' pour revecoir un objet contenant les propriétés unit (type de température), value (valeur de la température)
 */
public class TemperatureRequest {

    private String unit;
    private double value;
}
