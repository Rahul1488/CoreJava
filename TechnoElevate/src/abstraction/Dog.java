package abstraction;

public abstract class Dog {
abstract void bark();
abstract void eat();
abstract void bite();
public void poop()
{
System.out.println("the dog is pooping");	
}
double weight;
String breed;
int nails;
public Dog(double weight,int nails,String breed) {
	this.weight=weight;
	this.nails=nails;
	this.breed=breed;
	
}
	
}
