package com.uade.tpo.cars_e_commerce.service;

import java.util.List;
import java.util.Optional;

import com.uade.tpo.cars_e_commerce.entity.Car;
import com.uade.tpo.cars_e_commerce.exceptions.CarDuplicateException;
import com.uade.tpo.cars_e_commerce.exceptions.CarNotFoundException;

public interface CarService {

    List<Car> getCars();

    Optional<Car> getCarById(Long carId);

    void deleteCar(Long carId) throws CarNotFoundException;

    Car createCar(Car car) throws CarDuplicateException;

    List<Car> getCarByManufacturer(String manufacturer) throws CarNotFoundException;

    List<Car> getCarByPrice(Double price) throws CarNotFoundException;

    //List<Car> getCarByPriceRange(Double price_min, Double price_max) throws CarNotFoundException;

    List<Car> getCarByColor(String Color) throws CarNotFoundException;

    List<Car> getCarByModelName(String modelName) throws CarNotFoundException;

    List<Car> getCarByModelYear(int modelYear) throws CarNotFoundException;
    
    Car updateCar(Long cardId, Car updateCar);

}