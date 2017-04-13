package calcIerarchy;

public class FinCalc extends CalcMain {
	
	public FinCalc() {
		System.out.println("Financial calculator was created...");
	}
	
	public void percentage(float amount, int percent) {
		System.out.println((amount/100) * percent);
	}
	
	public void currencyConverter(String firstCurrency, String lastCurrency, int firstAmount, int lastAmount, float course) {
		lastAmount = (int) (firstAmount * course);
		System.out.println("With all the data that you have fave to me i can say that nowadays " + firstAmount + " " + firstCurrency + " is equal to " + lastAmount + " " + lastCurrency + ".");
	}
}
