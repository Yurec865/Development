package exercise2;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

	@Override
	public int compare(Car car1, Car car2) {
		return (int) (car1.getEngineCapacity() - car2.getEngineCapacity()) + (car1.getNumbersOfDoors() - car2.getNumbersOfDoors());
	}
}
