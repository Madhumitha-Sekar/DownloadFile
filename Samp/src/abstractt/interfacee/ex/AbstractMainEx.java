package abstractt.interfacee.ex;

public class AbstractMainEx extends AbstractEx {

	public static void main(String[] args) {
		AbstractEx aex = new AbstractTestEx();
		System.out.println("AbstractMainEx constructor called.... ");
		
		System.out.println(AbstractMainEx.getName());
		System.out.println("Abstract Static method called successfully... ");
	}

}
