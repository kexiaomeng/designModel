package com.sum.builder.parttern.builder;

import com.sum.builder.parttern.product.Product;

public interface Ibuilder {
	public void buildHead();
	public void buildBody();
	public Product getResult();
}
