package general.ex;

public class WrapperClassEx {

	public static void main(String[] args) {
		int value = 0; // Changed 'Integer' to 'int'
		System.out.println("WrapperClassEx.main()1... " + value);
		int value1 = 0;
		System.out.println("WrapperClassEx.main()2... " + value1);
		Integer parentid = value != 0 ? 1 : value1;
		System.out.println(parentid);
	}

}
