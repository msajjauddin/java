
package finance;

public class HomeLoan {

	public float common(double amount , int period){
		return amount < 1000000 ? 8.5f : 8.0f;
	}
	
	public float woman(double amount , int period){
		return common(amount,period) - 1;
	}

	public float soldier(double amount , int period){
		return common(amount, period) - 3;
	}


}
