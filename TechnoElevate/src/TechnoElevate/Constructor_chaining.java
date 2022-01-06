package TechnoElevate;

public class Constructor_chaining 
{
	int number1;
	int secondnumber2;
	public Constructor_chaining(int number1) {
		this.number1 = number1;
	}

	public Constructor_chaining(int number1, int secondnumber2) {
		
		this.number1 = number1;
		this.secondnumber2 = secondnumber2;
	}

	public static void main(String[] args) 
	{
		Constructor_chaining c1 = new Constructor_chaining(1);
		Constructor_chaining c2 = new Constructor_chaining(2,4);
		System.out.println(c1.number1);
		System.out.println(c2.number1);
	}
    


}
