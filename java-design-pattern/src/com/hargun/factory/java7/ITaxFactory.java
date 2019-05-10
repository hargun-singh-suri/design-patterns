package com.hargun.factory.java7;

public abstract class ITaxFactory {
	public abstract Tax getTax(String taxType) throws Exception;
}
