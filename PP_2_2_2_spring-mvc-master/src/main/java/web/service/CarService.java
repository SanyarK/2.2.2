package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("BMW", 180, 111));
        carList.add(new Car("Lada", 110, 505));
        carList.add(new Car("Lamborghini", 3, 123));
        carList.add(new Car("Volkswagen", 106, 786));
        carList.add(new Car("porshe", 10, 111));
    }

    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        } else {
            return carList.stream().limit(count).collect(Collectors.toList());
        }
    }

}


