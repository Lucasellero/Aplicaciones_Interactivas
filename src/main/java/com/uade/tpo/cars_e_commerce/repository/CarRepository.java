package com.uade.tpo.cars_e_commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.uade.tpo.cars_e_commerce.entity.Cars;
import java.util.List;
import java.util.Optional;


public interface CarRepository extends JpaRepository<Cars, Long> {
    boolean existsByModelNameAndManufacturer(String modelName, String manufacturer);

    @Query(value = "select c from Cars c where c.manufacturer = ?1")
    List<Cars> findByManufacturer(String manufacturer);

    @Query(value = "select c from Cars c where c.price = ?1")
    List<Cars> findByPrice(Double price);

    @Query(value = "select c from Cars c where c.price > ?1 and c.price < ?2")
    List<Cars> findByRangePrice(Double price_min, Double price_max);

    @Query(value = "select c from Cars c where c.color = ?1")
    List<Cars> findByColor(String Color);

    @Query(value = "select c from Cars c where c.modelName = ?1")
    List<Cars> findByModelName(String modelName);

    @Query(value = "select c from Cars c where c.modelYear = ?1")
    List<Cars> findByModelYear(int modelYear);
}
