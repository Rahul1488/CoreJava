package loose_coupling_assignment;

public class Laptop extends computer {

	@Override
	public void monitor() {
		System.out.println("there is 16' lcd display");

	}

	@Override
	public void keyboard() {
		System.out.println("there is a backlit keyboard");

	}

	@Override
	public void mouse() {
		System.out.println("there is touch pad");

	}

	@Override
	public void processor() {
		System.out.println("there is Inter core i5 processor of 10th gen");

	}

	@Override
	public void graphicard() {
		System.out.println("there is nvidia 4 gb graphic card");

	}

}
