package inheritence;

public class Mobile {

	public static void main(String[] args) {
		phone phone = new phone();
phone.cost=1200;
phone.colour="hot pink";
phone.sim=2;
phone.brand="kochadian";
System.out.println(phone.cost);
System.out.println(phone.colour);
System.out.println(phone.sim);
System.out.println(phone.brand);
phone.call();
phone.texting();
SmartPhone SmartPhone = new SmartPhone();
phone.cost=120000;
phone.colour="Samsung";
phone.sim=2;
phone.brand="orange";
System.out.println(phone.cost);
System.out.println(phone.colour);
System.out.println(phone.sim);
System.out.println(phone.brand);
SmartPhone.playPubg();
SmartPhone.surfing();
SmartPhone.texting();
SmartPhone.call();


	}

}
