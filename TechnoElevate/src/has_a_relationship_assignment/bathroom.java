package has_a_relationship_assignment;

public class bathroom {
String brandused;
int number;
public bathroom(String brandused, int number) {
	super();
	this.brandused = brandused;
	this.number = number;
}
@Override
public String toString() {
	return "bathroom [brandused=" + brandused + ", number=" + number + "]";
}

}
