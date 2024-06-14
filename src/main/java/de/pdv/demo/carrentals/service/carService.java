package de.pdv.demo.carrentals.service;

import org.springframework.stereotype.Component;

import de.pdv.demo.carrentals.model.Car;
import de.pdv.demo.carrentals.repository.CarRepository;
import jakarta.persistence.Id;


@Component
public class CarService {

    public CarService (CarRepository carrepository) {
        this.carrepository = carrepository;
    }

    private final CarRepository carrepository;

    public Iterable<Car> getAllCars() {
        return carrepository.findAll();
    }

    public Iterable<Car> getCarById(Long id) {
        return carrepository.findById(ID id);
    }

    public Iterable<Car> saveCar(Car car) {
        return  carrepository.saveAll(Iterable<Car>);
    }

    public Iterable<Car> deleteCar(Long id) {
        return  carrepository.deleteById(ID id);
    }

}
