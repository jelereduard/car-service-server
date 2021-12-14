package com.example.carService.service;

import com.example.carService.car.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/service")
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
    public List<Car> getCarsInService(
            @PathVariable("serviceId") Long id) {
        return service.getCarsInService(id);
    }

    @DeleteMapping(path = "{serviceId}")
    public void deleteCarService(@PathVariable("serviceId") Long serviceId) {
        service.deleteService(serviceId);
    }
//    @GetMapping(path = "{serviceName}")
//    public List<Car> getCarsInService(
//            @PathVariable("serviceName") String name) {
//        return service.getCarsInService(name);
//    }
}
