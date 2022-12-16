package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceCar implements ServiceCarI {

    private final List<Car> cars = new ArrayList<>();


    {
        Car car1 = new Car("Black", "Subaru", 2.5);
        Car car2 = new Car("Red", "Mazda", 2.3);
        Car car3 = new Car("Blue", "Toyota", 3.5);
        Car car4 = new Car("Grin", "Nissan", 1.6);
        Car car5 = new Car("Grey", "Mitsubishi", 2.2);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

    }
    @Override
    public List<Car> num(double count) {
        return cars.stream().limit((long) count).collect(Collectors.toList());
    }

}