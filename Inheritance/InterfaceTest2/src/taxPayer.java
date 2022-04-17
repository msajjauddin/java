package taxation;

public interface taxPayer {

	double annualIncome();

	default double incomeTax() {
		double i = annualIncome();
		return i > 120000 ? 0.15 * (i - 120000) : 0;	
	}
	




}
