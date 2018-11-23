package acstract.factory;

import acstract.factory.product.ProductA;
import acstract.factory.product.ProductB;
import acstract.factory.product.SmallA;
import acstract.factory.product.SmallB;

public class SmallProductFactory implements Ifactory{

	@Override
	public ProductA getProductA() {
		// TODO Auto-generated method stub
		return new SmallA();
	}

	@Override
	public ProductB getProductB() {
		// TODO Auto-generated method stub
		return new SmallB();
	}

}
