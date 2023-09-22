package web.config.DAO;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {

    private final List<Car>cars;

    public CarDaoImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Ford", "Mustang", 1994));
        cars.add(new Car("Mini", "Cooper", 2020));
        cars.add(new Car("Dodge", "Shadow", 2013));
        cars.add(new Car("Land Rover", "Discovery", 2017));
        cars.add(new Car("Pontiac", "Vibe", 2005));
    }
    @Override
    public List<Car> getAllCars() {
        return cars;
    }
    @Override
    public List<Car>getCars (int count) {
        return
        cars.stream().limit(count).collect(Collectors.toList());
    }
}
