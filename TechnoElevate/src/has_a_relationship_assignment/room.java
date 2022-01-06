package has_a_relationship_assignment;

public class room {
String ventilated;
String furnitured;
String attachedbathroom;
public room(String ventilated, String furnitured, String attachedbathroom) {
	super();
	this.ventilated = ventilated;
	this.furnitured = furnitured;
	this.attachedbathroom = attachedbathroom;
}
@Override
public String toString() {
	return "room [ventilated=" + ventilated + ", furnitured=" + furnitured + ", attachedbathroom=" + attachedbathroom
			+ "]";
}

}
