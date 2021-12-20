package com.example.carService.car;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    @Query("SELECT c FROM Car c where c.plate = ?1")
    Optional<Car> findCarByPlate(String plate);

//    @Query("delete from car_service_cars where cars_id = ?1")
//    void deleteFromService(Long id);
}
