package ch02.ex09;

public class Car {

	private double fuelEfficiency;
	private double fuelLevel = 0;
	private double positionX = 0;

	public Car(double fuelEfficiency) {
		setFuelEfficiency(fuelEfficiency);
	}

	public double getFuelEfficiency() {
		return fuelEfficiency;
	}

	public void setFuelEfficiency(double fuelEfficiency) {
		this.fuelEfficiency = fuelEfficiency;
	}

	public double getFuelLevel() {
		return fuelLevel;
	}

	public void setFuelLevel(double fuelLevel) {
		this.fuelLevel = fuelLevel;
	}

	public void addFuel(double gallons) {
		setFuelLevel(getFuelLevel() + gallons);
	}

	public double getPositionX() {
		return positionX;
	}

	public void setPositionX(double positionX) {
		this.positionX = positionX;
	}

	public void drive(double miles) throws Exception {
		double requiredFuel = miles / fuelEfficiency;
		if (requiredFuel > getFuelLevel()) {
			throw new Exception("You don't have enough fuel for this action!");
		} else {
			setPositionX(getPositionX() + miles);
			setFuelLevel(getFuelLevel() - requiredFuel);
		}
	}

}
