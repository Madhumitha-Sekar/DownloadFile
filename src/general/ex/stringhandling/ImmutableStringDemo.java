package general.ex.stringhandling;

public final class ImmutableStringDemo {

	private final String pancardNumber;

	public ImmutableStringDemo(String pancardNumber) {
		this.pancardNumber = pancardNumber;
	}

	public String getPancardNumber() {
		return pancardNumber;
	}

}
