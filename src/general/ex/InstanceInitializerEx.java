package general.ex;

public class InstanceInitializerEx /*extends CommonClass*/ {

	int speed = 100;

	public InstanceInitializerEx() {
		super();
		System.out.println("InstanceInitializer constructor invoked..." + speed);
	}

	/* Instance initializer block method */
	{
		System.out.println("InstanceInitializer block invoked..." + speed);
		speed = 700;
	}

	public static void main(String args[]) {
		new InstanceInitializerEx();
	}

}
