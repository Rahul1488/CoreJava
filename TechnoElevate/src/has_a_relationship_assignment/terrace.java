package has_a_relationship_assignment;

public class terrace {
	String openterrace;
	String gardanable;
	String lawn;

	public terrace(String openterrace, String gardanable, String lawn) {
		super();
		this.openterrace = openterrace;
		this.gardanable = gardanable;
		this.lawn = lawn;
	}

	@Override
	public String toString() {
		return "terrace [openterrace=" + openterrace + ", gardanable=" + gardanable + ", lawn=" + lawn + "]";
	}

}
