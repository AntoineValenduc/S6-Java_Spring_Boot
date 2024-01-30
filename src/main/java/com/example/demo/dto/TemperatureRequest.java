package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class TemperatureRequest {
    //En fait c'est un autre DTO

    private String unit;
    private double value;
}
