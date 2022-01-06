package has_a_relationship_assignment;

public class kitchen {
String type;
int squarefeet;
String woodused;
public kitchen(String type, int squarefeet, String woodused) {
	super();
	this.type = type;
	this.squarefeet = squarefeet;
	this.woodused = woodused;
}
@Override
public String toString() {
	return "kitchen [type=" + type + ", squarefeet=" + squarefeet + ", woodused=" + woodused + "]";
}

}
