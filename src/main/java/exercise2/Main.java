package exercise2;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet <Car> cars = new TreeSet<>(new CarComparator());

        Car car1 = new Car();
        car1.setNumbersOfDoors(2);
        car1.setEngineCapacity(1.6);
        car1.setName("car1");
        cars.add(car1);

        Car car2 = new Car();
        car2.setName("car2");
        car2.setNumbersOfDoors(4);
        car2.setEngineCapacity(2.3);
        cars.add(car2);

        for (Car car : cars) {
            System.out.println(car.getName());
        }
    }
}
