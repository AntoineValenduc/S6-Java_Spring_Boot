package com.example.demo.controllers;

import com.example.demo.dto.TemperatureDto;
import com.example.demo.dto.TemperatureRequest;
import com.example.demo.services.TemperatureService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/temperature")
public class TemperatureController {

    private final TemperatureService service;

    public TemperatureController(TemperatureService service) {
        this.service = service;
    }

    /**
     * Permet de retourner les températures en fonction de la température en Celsius
     * @param celsius température en celsius
     * @return TemperatureDto (celsius, fahrenheit, kelvin)
     */
    @GetMapping
    public TemperatureDto getTemperatureFromCelsius(@RequestParam (defaultValue = "0") Double celsius){
            return service.convertTemperature(celsius, "celsius");
    }

    /**
     * Permet de retourner les températures en fonction du type de température et de sa valeur
     * @param request object (valeur, type)
     * @return TemperatureDto (celsius, fahrenheit, kelvin)
     */
    @PostMapping("/convert")
    public TemperatureDto convertTemperature(@RequestBody TemperatureRequest request){
        return service.convertTemperature(request.getValue(), request.getUnit());
    }

}
