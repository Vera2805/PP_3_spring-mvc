package web.controller;

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

    public CarController(CarService carService) {
        this.carService = carService;

    }

    public CarController() {

    }

    @GetMapping(value = "/")
    public String getCars(ModelMap model, @RequestParam(name = "count", defaultValue = "0", required = false) Integer count) {


        List<Car> cars = carService.getCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}





