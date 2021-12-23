package com.example.carService.service;

import com.example.carService.car.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/service")
@CrossOrigin(origins = "http://localhost:3000/")
public class CarServiceController {

    private final CarServiceService service;
    private final com.example.carService.car.CarService carService;

    @Autowired
    public CarServiceController(CarServiceService service, com.example.carService.car.CarService carService) {
        this.service = service;
        this.carService = carService;
    }

    @GetMapping
    public List<CarService> getServiceList() {
        return service.getServiceList();
    }

    @GetMapping(path = "{serviceId}")
    public CarService getService(@PathVariable("serviceId") Long id) {
        return service.getService(id);
    }

    @PostMapping(path = "{serviceId}")
    public Car addCarInService(@PathVariable("serviceId") Long serviceId, @RequestBody Car car) {
        Car newCar = carService.addNewCar(car);
        return service.addCarToService(newCar, serviceId);
    }

//    @PostMapping(path = "add-floresti/")
//    public Car addCarToFloresti(@RequestBody Car car) {
//        Car newCar = carService.addNewCar(car);
//        return service.addCarToFloresti(newCar);
//    }

    @DeleteMapping(path="{serviceId}")
    public void deleteCarFromService(@PathVariable("serviceId") Long serviceId, @RequestParam() Long carId) {
        service.deleteCarFromService(serviceId, carId);
    }
}