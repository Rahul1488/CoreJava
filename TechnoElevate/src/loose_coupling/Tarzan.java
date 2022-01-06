package loose_coupling;


public class Tarzan implements Car{

	@Override
	public void start() {
		System.out.println("Taarazannn");
	}

	@Override
	public void accelerate() {
		System.out.println("weeeeeeee");		
	}

	@Override
	public void brake() {
		System.out.println("tuk ruk");		
	}

	
}
