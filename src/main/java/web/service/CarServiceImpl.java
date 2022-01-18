package web.service;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
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
    public List<Car> getCars(int count) {
        return cars.subList(0, (Integer) count);
    }
}


