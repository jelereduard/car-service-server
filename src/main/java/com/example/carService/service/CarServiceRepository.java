package com.example.carService.service;

import com.example.carService.car.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarServiceRepository extends JpaRepository<CarService, Long> {

    @Query("SELECT s FROM CarService s where s.name = ?1")
    Optional<CarService> findServiceByName(String name);

//    @Query("delete from car_service_cars where cars_id = ?1")
//    void deleteFromService(Long id);
}
