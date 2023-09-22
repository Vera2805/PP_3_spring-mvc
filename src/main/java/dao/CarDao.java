package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;

public interface CarDao {


    List<Car> getAllCars();

    List<Car> getCars(int count);


}
