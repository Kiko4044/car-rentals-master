package de.pdv.demo.carrentals.repository;

import de.pdv.demo.carrentals.model.Car;
import org.springframework.data.repository.CrudRepository;

/**
 * manages access to a database
 */
public interface CarRepository extends CrudRepository<Car, Long>
{
}
