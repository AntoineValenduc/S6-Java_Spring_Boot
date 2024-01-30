package com.example.demo.services;

import com.example.demo.dto.TemperatureDto;
import org.springframework.stereotype.Service;

public interface TemperatureService {

    /**
     * Retourne les températures avec par défaut la température en Celsius = 0
     * @return TemperatureDto
     */
    public TemperatureDto getTemperature();

    /**
     * Retourne les températures en fonction de la température fournit en Celsuis
     * @param value valeur de la température
     * @return TemperatureDto
     */
    public TemperatureDto getTemperature(double value);

    /**
     * Retourne les températures en fonction du type de température fournit et de sa valeur
     * @param value valeur de la température
     * @param unit Type de température (celsius, fahrenheit, kelvin)
     * @return TemperatureDto
     */
    public TemperatureDto convertTemperature(double value, String unit);


}
