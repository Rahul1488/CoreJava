package multilevelInheritence;

public class Child extends Parent {
	int x;
	int y;

	public Child(int x, int y) {
		super(x, y);
		this.x = x;
		this.y = 20;
	}

}
