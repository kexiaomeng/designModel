import acstract.factory.Ifactory;
import acstract.factory.LargeProductFactory;
import acstract.factory.SmallProductFactory;

public class Test {
	public static void main(String[] args) {
		Ifactory ifactory = new LargeProductFactory();
		
		ifactory.getProductA().createProduct();
		ifactory.getProductB().createProduct();

	}
}
