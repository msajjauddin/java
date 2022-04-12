class Investment {
// private variables
private double amount;
private int year;
private boolean isRisky;

//constructor to initialize variables
public Investment(double p, int y){
	amount	= p;
	year	= y;
	isRisky	= false; //we are setting risk to false so investment will be riskfree at the begining.

}

public void setRisk(boolean risk){
	isRisky	= risk;
}

public double getInvest(){
	float rate = isRisky ? 0.08f : 0.06f;
	double invest = (amount / rate ) *(Math.pow(1+rate,year)-1);

	return invest;
}






}
