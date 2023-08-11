package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	public static double dolarPrice;
	public static double dolarBought;
	
	
	public static double totalValue() {
		return (dolarPrice*dolarBought)+(dolarPrice*dolarBought*0.06);
	}

}
