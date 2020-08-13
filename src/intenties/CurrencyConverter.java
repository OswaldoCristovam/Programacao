package intenties;

public class CurrencyConverter {

	public static double IOF = 6.0;
	
	public static double calculator(double dollar, double howMany) {
		return (dollar * howMany) + (dollar * howMany * IOF / 100);
	}
	
}
