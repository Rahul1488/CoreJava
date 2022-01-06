package has_a_relationship;

public class operatings {
String brand;
double version;
double bit;
public operatings(String brand, double version, double bit) {
	super();
	this.brand = brand;
	this.version = version;
	this.bit = bit;
}
@Override
public String toString() {
	return "operatings [brand=" + brand + ", version=" + version + ", bit=" + bit + "]";
}

}
