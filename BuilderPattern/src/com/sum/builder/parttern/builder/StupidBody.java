package com.sum.builder.parttern.builder;

import com.sum.builder.parttern.product.Product;

public class StupidBody implements Ibuilder{
	
	private Product product;
	
	
	public StupidBody() {
		// TODO Auto-generated constructor stub
		product = new Product();
	}

	@Override
	public void buildHead() {
		
		this.product.setHead("stupid head build");
	}
	
	@Override
	public void buildBody() {
		this.product.setHead("stupid body build");

	}

	@Override
	public Product getResult() {
		// TODO Auto-generated method stub
		return this.product;
	}
}
