package has_a_relationship;

public class Laptop {
	double cost;
	private battery battery;
	private operatings os;
	private hardDisk hardDisk;
	private processor processor;
	public Laptop(double cost,battery battery, operatings os,hardDisk hardDisk,
			processor processor) {
		super();
		this.cost = cost;
		this.battery = battery;
		this.os = os;
		this.hardDisk = hardDisk;
		this.processor = processor;
	}
	@Override
	public String toString() {
		return "Laptop [cost=" + cost + ", battery=" + battery + ", os=" + os + ", hardDisk=" + hardDisk
				+ ", processor=" + processor + "]";
	}
	
	

}
