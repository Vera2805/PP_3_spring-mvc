package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {

    private List<Car> cars;

    public CarDaoImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", "X5", 2018));
        cars.add(new Car("Mercedes-Benz", "E-Class", 2019));
        cars.add(new Car("Audi", "Q7", 2020));
        cars.add(new Car("Toyota", "Camry", 2021));
        cars.add(new Car("Honda", "Accord", 2022));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }



    @Override
    public List<Car> getCars(int count) {
        if (count == 0 || count >= 5) {
            return getAllCars();

        } else {
            //return getCars(0, (Integer) count);
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }


}


   // public List<Car> getCars(Integer count) {
   //    if (count == 0 || count >= 5) {
   //        return carDao.getAllCars();
   //    }
   //     } else {return carDao.getCars(0, (Integer) count);
   //     return cars.stream().limit(count).collect(Collectors.toList());




