package loose_coupling;

public class Driver {
	Car car;

	// helper
	public void driver(String s) {
		if (s.equalsIgnoreCase("audi")) {
			car = new Audi();
			car.start();
			car.accelerate();
			car.brake();

		}
		if (s.equalsIgnoreCase("tarzan")) {
			car = new Tarzan();
			car.start();
			car.accelerate();
			car.brake();

		}
		if(s.equalsIgnoreCase("rollsroyce")) {
			car = new RollsRoyce();
			car.start();
			car.accelerate();
			car.brake();
		}
	}
}
