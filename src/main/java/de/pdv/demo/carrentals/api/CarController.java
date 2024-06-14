package de.pdv.demo.carrentals.api;

import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import de.pdv.demo.carrentals.model.Car;
import de.pdv.demo.carrentals.service.CarService;



@RestController
@RequestMapping("api/cars/{id}")
public class CarController {

    public CarController (CarService carService) {
        this.carService = carService;
    }

    private final CarService carService;

    @GetMapping("api/cars")
    public Iterable<Car> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping("api/cars/{id}")
    public Optional<Car> getCarById() {
        return carService.getCarById(); 
    }

    @PostMapping("api/cars")
    public Car saveCar() {
        return carService.saveCar(); 
    }

    @PutMapping("api/cars/{id}")
    public () {
        return;
    }

    @DeleteMapping("api/cars/{id}")
    public boolean deleteCar() {
        return carService.deleteCar(); 
    }

}
