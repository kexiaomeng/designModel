package com.sum.builder.parttern.builder;

import com.sum.builder.parttern.product.Product;

public class CleverBody implements Ibuilder{
	
	private Product product;
	
	public CleverBody() {
		product = new Product();
	}
	@Override
	public void buildHead() {
		product.setHead("clever head build");
	}
	
	@Override
	public void buildBody() {
		product.setBody("clever head build");

	}
	
	@Override
	public Product getResult() {
		// TODO Auto-generated method stub
		return product;
	}
}
