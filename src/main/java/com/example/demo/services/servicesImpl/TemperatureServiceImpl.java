package com.example.demo.services.servicesImpl;

import com.example.demo.dto.TemperatureDto;
import com.example.demo.services.TemperatureService;
import org.springframework.stereotype.Service;

@Service
public class TemperatureServiceImpl implements TemperatureService {

    @Override
    public TemperatureDto getTemperature() {
        return calculFromCelsius(0);
    }

    @Override
    public TemperatureDto getTemperature(double value) {
        return calculFromCelsius(value);
    }

    @Override
    public TemperatureDto convertTemperature(double value, String unit) {

        switch (unit){
            case ("celsius"):
                return calculFromCelsius(value);
            case ("fahrenheit"):
                return calculFromFahrenheit(value);
            case ("kelvin"):
                return calculFromKelvin(value);
            default:
                throw new IllegalArgumentException("La valeur de 'unit' n'est pas reconnu, utilisez 'celsius', 'fahrenheit', ou 'kelvin'");
        }
    }

    /**
     * Méthode interne permettant de calculer les températures en fonction d'une température fournit en Celsius
     * @param value
     * @return
     */
    private TemperatureDto calculFromCelsius(double value){
        TemperatureDto dto = new TemperatureDto();
        dto.setCelsius(value);
        dto.setFahrenheit(((double) 5 /9) * value + 32);
        dto.setKelvin(value + 273.15);
        return dto;
    }

    /**
     * Méthode interne permettant de calculer les températures en fonction d'une température fournit en Fahrenheit
     * @param value
     * @return
     */
    private TemperatureDto calculFromFahrenheit(double value){
        TemperatureDto dto = new TemperatureDto();
        dto.setCelsius(1.8 * (value - 32));
        dto.setFahrenheit(value);
        dto.setKelvin((value - 32) * ((double) 5 /9) + 273.15);
        return dto;
    }

    /**
     * Méthode interne permettant de calculer les températures en fonction d'une température fournit en Kelvin
     * @param value
     * @return
     */
    private TemperatureDto calculFromKelvin(double value){
        TemperatureDto dto = new TemperatureDto();
        dto.setCelsius(value - 273.15);
        dto.setFahrenheit((value - 273.15) * 1.8 + 32);
        dto.setKelvin(value);
        return dto;
    }
}
