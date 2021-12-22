//package com.example.carService.car;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.Arrays;
//
//@Configuration
//public class CarConfig {
//
//    @Bean
//    CommandLineRunner carConfigInit(CarRepository repository) {
//        return args -> {
//            Car car1 = new Car(
//                    "Audi",
//                    "A6",
//                    "Red",
//                    2014,
//                    "CJ06QAZ"
//            );
//            Car car2 = new Car(
//                    "BMW",
//                    "e46",
//                    "Blue",
//                    1998,
//                    "CJ46BMW"
//            );
//            repository.saveAll(Arrays.asList(car1, car2));
//        };
//    }
//}
