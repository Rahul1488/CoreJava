package exceptions;

public class Manikanth_coustom_exception {
	public void happen()throws Blocked {
		System.out.println("Hello,Kutti");
		throw new Blocked("You are not elegible to be my soulmate");
	}

	public static void main(String[] args) {
		Manikanth_coustom_exception ob = new Manikanth_coustom_exception();
		try {
			ob.happen();
		} catch (Blocked e) {
			System.out.println(e.messege);
			
		}
	}
}
