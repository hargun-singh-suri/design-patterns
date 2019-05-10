package com.hargun.factory.java8;

public class MainFactoryPattern {

	public static void main(String args[]) throws Exception {
		System.out.println("******Factory pattern Demo JAVA 8 Way******");
		ITaxFactory factory = new ConcreteTaxFactory();

		System.out.println("******Basic Tax****** ");
		Tax taxBasic = factory.getTax("Basic");
		taxBasic.tax();

		System.out.println("******Import Tax****** ");
		Tax taxImport = factory.getTax("Import");
		taxImport.tax();

	}

}
