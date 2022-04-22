
interface Interest {
	
	float forPeriod(int y);

}
class Investment {

	//two varibales
	private final double payment;
	private final int years;

	public Investment(double payment, int years){
		this.payment = payment;
		this.years = years;
	}
	public double getPayment(){
	return payment;
	}
	public int getYears(){
	return years;
	}
	//to calculate our future value of our investment
	public double futureValue(Interest rate){
		float r = rate.forPeriod(years) / 100;
		return (payment / r) * (Math.pow(1+r, years) -1);
		

	}



}









