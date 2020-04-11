package ch02.ex09;

public class Main {

	public static void main(String[] args) {
		Car car = new Car(20);

		System.out.println("Car initial status:\n" + "  Fuel Efficiency: " + car.getFuelEfficiency() + "\n"
				+ "  Fuel Level: " + car.getFuelLevel() + "\n" + "  PositionX: " + car.getPositionX());

		try {
			car.drive(20);
		} catch (Exception e) {
			System.out.println("Exception while attempting to drive: " + e.getMessage());
		}

		car.addFuel(10);
		System.out.println("Car initial status:\n" + "  Fuel Level: " + car.getFuelLevel() + "\n" + "  PositionX: "
				+ car.getPositionX());

		try {
			car.drive(20);
		} catch (Exception e) {
			System.out.println("Exception while attempting to drive: " + e.getMessage());
		}
		System.out.println("Car initial status:\n" + "  Fuel Level: " + car.getFuelLevel() + "\n" + "  PositionX: "
				+ car.getPositionX());
	}

}
