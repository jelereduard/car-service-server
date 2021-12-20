package com.example.carService.service;

import com.example.carService.car.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/service")
@CrossOrigin(origins = "http://localhost:3000/")
public class CarServiceController {

    private final CarServiceService service;

    @Autowired
    public CarServiceController(CarServiceService service) {
        this.service = service;
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
    public void addCarInService(@PathVariable("serviceId") Long serviceId, @RequestBody Car car) {
        service.addCarToService(car, serviceId);
    }

    @DeleteMapping(path="{serviceId}")
    public void deleteCarFromService(@PathVariable("serviceId") Long serviceId, @RequestParam() Long carId) {
        service.deleteCarFromService(serviceId, carId);
    }
}