package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Service
public class CarServiceImpl implements CarService {


    private final CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;

    }

    private List<Car> cars = new ArrayList<>();

    @Override
    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0 || count >= 5) {
            return carDao.getAllCars();
        } else {
            return carDao.getCars(count);
           // return cars.subList(0, (Integer) count);
        }
    }
}

