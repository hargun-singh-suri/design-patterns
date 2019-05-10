package com.hargun.factory.java8;

public abstract class ITaxFactory {
	public abstract Tax getTax(String taxType) throws Exception;
}
