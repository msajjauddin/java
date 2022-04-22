
package finance;

public class PersonalLoan {

	public float common(double amount , int period){
		return 10 + 0.75f * (period / 3);
	}
	
	public float employee(double amount , int period){
		return common(amount,period) / 2;
	}


}
