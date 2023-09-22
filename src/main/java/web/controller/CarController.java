package web.controller;

import dao.CarDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.model.Car;


import java.util.List;

@Controller
@RequestMapping("/")
public class CarController {
    private CarService carService;
    private  CarDao carDao;

    public CarController(CarService carService, CarDao  carDao) {
        this.carService = carService;
        this.carDao = carDao;
    }
public CarController () {

}

    @GetMapping(value = "/")
    public String getCars(ModelMap model, @RequestParam(name = "count", defaultValue = "0", required = false) Integer count) {

       // if (count == 0 || count >= 5) {
         //   cars = new CarServiceImpl().getAllCars();
         // } else {
        //      cars = new CarServiceImpl().getCars(count);
       // List<Car> cars = carService.getCars(count);
        List<Car> cars = carDao.getCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
    }





