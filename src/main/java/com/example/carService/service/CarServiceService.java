package com.example.carService.service;

import com.example.carService.car.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceService {
    private final CarServiceRepository carServiceRepository;

    @Autowired
    public CarServiceService(CarServiceRepository carServiceRepository) {
        this.carServiceRepository = carServiceRepository;
    }

    public List<CarService> getServiceList() {
        return carServiceRepository.findAll();
    }

    public List<Car> getCarsInService(String name) {
        return carServiceRepository.findServiceByName(name).get().getCars();
    }

    public List<Car> getCarsInService(Long id) {
        return carServiceRepository.getById(id).getCars();
    }

    public void deleteService(Long serviceId) {
        if (carServiceRepository.existsById(serviceId)) {
            carServiceRepository.deleteById(serviceId);
        } else {
            throw new IllegalStateException("service with id: " + serviceId + " does not exist");
        }
    }
}
