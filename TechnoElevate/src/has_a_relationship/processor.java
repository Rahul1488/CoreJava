package has_a_relationship;

public class processor {
String brand;
int core;
int bit;
public processor(String brand, int core, int bit) {
	super();
	this.brand = brand;
	this.core = core;
	this.bit = bit;
}
@Override
public String toString() {
	return "processor [brand=" + brand + ", core=" + core + ", bit=" + bit + "]";
}

}
