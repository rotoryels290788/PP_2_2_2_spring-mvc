package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.ServiceCar;
import web.service.ServiceCarI;


@Controller
public class CarController {
    private final ServiceCarI serviceCarI;

    @Autowired
    public CarController(ServiceCarI serviceCarI) {
        this.serviceCarI = serviceCarI;
    }

    @GetMapping(value = "/car")
    public String getCar(@RequestParam(value = "count", required = false, defaultValue = "5") int count, Model model) {

        model.addAttribute("car", serviceCarI.num(count));
        return "cars";
    }
}
