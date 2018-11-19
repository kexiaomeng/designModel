package com.sum.builder.parttern.director;

import com.sum.builder.parttern.builder.Ibuilder;
import com.sum.builder.parttern.product.Product;

public class Director {
	
	private Ibuilder ibuilder;
	
	public Director(Ibuilder ibuilder) {
		this.ibuilder = ibuilder;
	}
	
	
	public Product createProduct() {
		
		ibuilder.buildHead();
		ibuilder.buildBody();
		return ibuilder.getResult();
	}
	
	
	public void printResult() {
		
		Product product = createProduct();
		System.out.println(product.getBody()+","+product.getHead());
	}
}
