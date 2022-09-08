package general.ex.abstraction;

public interface CommonInterfaceEx {
	void print();

	default String defMethodEx() {
		return "Interface Default Method Example";
	}
	
	static String staticMethodEx() {
		return "Interface Static Method Example";
	}
}
