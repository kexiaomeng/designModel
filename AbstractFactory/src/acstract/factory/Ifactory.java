package acstract.factory;

import acstract.factory.product.ProductA;
import acstract.factory.product.ProductB;

public interface Ifactory {
	
	public ProductA getProductA();
	public ProductB getProductB();
	
}
