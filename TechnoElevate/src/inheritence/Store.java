package inheritence;

public class Store extends Laptop{
public static void main(String[] args) {
	Laptop laptop = new Laptop();
	laptop.LaptopProcessor();
	laptop.LaptopRam();
	laptop.LaptopRam();
	System.out.println("============================");
	
	laptop.LaptopProcessor();
	laptop.LaptopRam();
	laptop.LaptopRom();
}
}
