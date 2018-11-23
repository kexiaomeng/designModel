package acstract.factory;

import acstract.factory.product.LargeA;
import acstract.factory.product.LargeB;
import acstract.factory.product.ProductA;
import acstract.factory.product.ProductB;
import acstract.factory.product.SmallA;
import acstract.factory.product.SmallB;

public class LargeProductFactory implements Ifactory{

	@Override
	public ProductA getProductA() {
		// TODO Auto-generated method stub
		return new LargeA();
	}

	@Override
	public ProductB getProductB() {
		// TODO Auto-generated method stub
		return new LargeB();
	}

}
