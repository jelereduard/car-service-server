package com.example.carService.service;

import com.example.carService.car.Car;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class CarServiceConfig {

    @Bean
    CommandLineRunner serviceConfigInit(CarServiceRepository carServiceRepository) {
        return args -> {
            CarService carService1 = new CarService(
                    "Manastur",
                    12,
                    Arrays.asList(
                            new Car(
                                    "Audi",
                                    "A6",
                                    "Red",
                                    2014,
                                    "CJ06QAZ"
                            ),
                            new Car(
                                    "Dacia",
                                    "Logan",
                                    "Yellow",
                                    2007,
                                    "CJ10DAC"
                            )
                    )
            );
            carServiceRepository.saveAll(Arrays.asList(carService1));
        };
    }
}
