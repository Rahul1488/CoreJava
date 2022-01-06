package abstraction;

public class Zoey extends Dog {

	public Zoey(double weight, int nails, String breed) {
		super(weight, nails, breed);
		// TODO Auto-generated constructor stub
	}

	@Override
	void bark() {
		// TODO Auto-generated method stub
		System.out.println(" baw baw");
		
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("curd rice and egg");
		
	}

	@Override
	void bite() {
		// TODO Auto-generated method stub
		System.out.println("it dosent bites");
	}

}
