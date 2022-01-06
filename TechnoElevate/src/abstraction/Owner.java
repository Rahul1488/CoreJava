package abstraction;

public class Owner {
public static void main(String[] args) {
Rocky rocky=new Rocky(40.55,20,"Labrodor");	
rocky.bark();
rocky.bite();
rocky.eat();
rocky.poop();
System.out.println("weight"+rocky.weight);
System.out.println("nails"+rocky.nails);
System.out.println("Breed"+rocky.breed);
System.out.println("======");
Ginnne ginnne = new Ginnne(50.55,20,"Dalmation");
ginnne.bark();
ginnne.bite();
ginnne.eat();
ginnne.poop();
System.out.println("weight"+ginnne.weight);
System.out.println("nails"+ginnne.nails);
System.out.println("Breed"+ginnne.breed);
}
}
