package com.hargun.factory.java8;

public class ConcreteTaxFactory extends ITaxFactory {

	@Override
	public Tax getTax(String taxType) throws Exception {
		
		switch(taxType) {
		case "Basic":
			return () -> System.out.println("This is Basic Tax of 10%");
		case "Import" :
			return () -> System.out.println("This is Import Tax of 5%");
		default :
			throw new Exception("Tax type "+taxType+" unkown");

		}
	}

}
