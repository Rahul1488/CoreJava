package has_a_relationship;

public class hardDisk {
String brand;
int size;
String type;
public hardDisk(String brand, int size, String type) {
	super();
	this.brand = brand;
	this.size = size;
	this.type = type;
}
@Override
public String toString() {
	return "hardDisk [brand=" + brand + ", size=" + size + ", type=" + type + "]";
}

}
