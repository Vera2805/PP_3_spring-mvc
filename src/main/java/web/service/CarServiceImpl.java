package web.service;

import dao.CarDao;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;


@Service
public class CarServiceImpl implements CarService {
    //private List<Car> cars = new ArrayList<>();

    private CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;

    }
    public CarServiceImpl () {

    }


        public List<Car> getAllCars () {
            return carDao.getAllCars();
        }

        public List<Car> getCars ( int count){
            if (count == 0 || count >= 5) {
                return carDao.getAllCars();
            } else {
                return carDao.getCars(count);
                // return cars.subList(0, (Integer) count);
            }
        }
    }

