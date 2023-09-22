package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/")
public class CarController {
private final CarService carService;

@Autowired
    public CarController (CarService carService) {
    this.carService = carService;
}

   @GetMapping(value = "/")
    public String getCars(ModelMap model, @RequestParam(name = "count", defaultValue = "0", required = false) Integer count) {
        List<Car> cars;
        if (count == 0 || count >= 5) {
            cars = new CarServiceImpl().getAllCars();
        } else {
            cars = new CarServiceImpl().getCars(count);
        }
        model.addAttribute("cars", cars);
        return "cars";
    }
}





