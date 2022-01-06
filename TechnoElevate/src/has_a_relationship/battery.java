package has_a_relationship;

public class battery {
String brand;
double mah;
double volt;
public battery(String brand, double mah, double volt) {
	super();
	this.brand = brand;
	this.mah = mah;
	this.volt = volt;
}
@Override
public String toString() {
	return "battery [brand=" + brand + ", mah=" + mah + ", volt=" + volt + "]";
}

}


