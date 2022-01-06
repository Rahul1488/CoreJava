package has_a_relationship_assignment;

public class House {
double cost;
kitchen kitchen;
room room;
bathroom bathroom;
terrace terrace;
public House(double cost, has_a_relationship_assignment.kitchen kitchen, has_a_relationship_assignment.room room,
		has_a_relationship_assignment.bathroom bathroom, has_a_relationship_assignment.terrace terrace) {
	super();
	this.cost = cost;
	this.kitchen = kitchen;
	this.room = room;
	this.bathroom = bathroom;
	this.terrace = terrace;
}
@Override
public String toString() {
	return "House [cost=" + cost + ", kitchen=" + kitchen + ", room=" + room + ", bathroom=" + bathroom + ", terrace="
			+ terrace + "]";
}

}


