package loose_coupling;

public class Audi implements Car{

	@Override
	public void start() {
		System.out.println("zuuun zuun");
		
	}

	@Override
	public void accelerate() {
	System.out.println("mmmmmmmmm");
		
	}

	@Override
	public void brake() {
	System.out.println("khach khach");
		
	}

}
