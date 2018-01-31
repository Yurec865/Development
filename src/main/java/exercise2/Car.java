package exercise2;

public class Car{
    private int numbersOfDoors;
    private double engineCapacity;
    private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumbersOfDoors() {
        return numbersOfDoors;
    }

    public void setNumbersOfDoors(int numbersOfDoors) {
        this.numbersOfDoors = numbersOfDoors;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
