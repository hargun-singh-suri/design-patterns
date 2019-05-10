package com.hargun.factory.java7;

public class MainFactoryPattern {

	public static void main(String args[]) throws Exception {
		System.out.println("******Factory pattern Demo JAVA 7 Way******");
		ITaxFactory factory = new ConcreteTaxFactory();

		System.out.println("******Basic Tax****** ");
		Tax taxBasic = factory.getTax("Basic");
		taxBasic.tax();

		System.out.println("******Import Tax****** ");
		Tax taxImport = factory.getTax("Import");
		taxImport.tax();
	}

}
