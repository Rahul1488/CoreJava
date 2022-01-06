package loose_coupling_assignment;

public class Desktop extends computer {

	@Override
	public void monitor() {
		System.out.println("the size of the monitor is 19'");

	}

	@Override
	public void keyboard() {
		System.out.println("there is an external keyboard");

	}

	@Override
	public void mouse() {
		System.out.println("there is an external wired mouse");

	}

	@Override
	public void processor() {
		System.out.println("processor is intel core i3");

	}

	@Override
	public void graphicard() {
		System.out.println("there is no external graphic card but it has integrated graphics");

	}

}
