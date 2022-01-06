package loose_coupling;

public class RollsRoyce implements Car {

	@Override
	public void start() {
		System.out.println("baaam");
		
	}

	@Override
	public void accelerate() {
	System.out.println("zuuuuuuuuuuuuuuuuu");
		
	}

	@Override
	public void brake() {
	System.out.println("hooooooooooooooo");
		
	}

}
