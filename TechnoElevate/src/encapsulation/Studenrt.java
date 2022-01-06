package encapsulation;

public class Studenrt {
	String name;
	int Rollno;
	private double marks;

	public double getMarks() {
		return marks;
	}



	public void setMarks(double marks) {
		this.marks = marks;
	}



	public Studenrt(String name, int rollno, double marks) {
		super();
		this.name = name;
		Rollno = rollno;
		this.marks = marks;
	}

}
