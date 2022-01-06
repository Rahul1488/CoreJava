package abstraction;

public class Ginnne extends Dog{

	public Ginnne(double weight, int nails, String breed) {
		super(weight, nails, breed);

	}

	@Override
	void bark() {
		System.out.println("BOW BOW");
	}

	@Override
	void eat() {
		System.out.println("pedegree and chicken");
		
	}

	@Override
	void bite() {
		System.out.println("it shows teeth");
		
	}

}
