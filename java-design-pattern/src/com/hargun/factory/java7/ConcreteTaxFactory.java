package com.hargun.factory.java7;

public class ConcreteTaxFactory extends ITaxFactory {

	@Override
	public Tax getTax(String taxType) throws Exception {
		
		switch(taxType) {
		case "Basic":
			return new BasicTax();
		case "Import" :
			return new ImportTax();
		default :
			throw new Exception("Tax type "+taxType+" unkown");

		}
	}

}
