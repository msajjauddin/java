enum RiskLevel { NONE, LOW, HIGH;}

class Investment {
// private variables
private double amount;
private int year;
private RiskLevel isRisky;

//constructor to initialize variables
public Investment(double p, int y){
	amount	= p;
	year	= y;
	isRisky	= RiskLevel.NONE; //we are setting risk to false so investment will be riskfree at the begining.

}

public void setRisk(boolean risk){
	 isRisky = risk ? RiskLevel.LOW : RiskLevel.NONE;
/*	switch(risk){		//here we tried to switch boolean type but it is not possible to switch boolean because switch works o//n it tpye 
		case true:
			isRisky = RiskLevel.LOW;
			break;
		case false:
			isRisky = RiskLevel.NONE;
			break;	
	}
*/
}
//now here is important point according to ocp rule the functions which are exposed to client/user .we can not change its declaretion 
//but we can change its implementations because we only exposed its method with parameters
//so intead of doing something in setRisk() function we goona overload same method which will accept enumtype as a argument
public void setRisk(RiskLevel risk){
	isRisky = risk;
}

public double getInvest(){
	//float rate = isRisky ? 0.08f : 0.06f;

	float rate;
	switch(isRisky){
		case HIGH:
			 rate = 0.12f;
			break;
		case LOW:
			 rate = 0.08f;
			break;
		default:
			 rate = 0.06f;
			break;
	}

	double invest = (amount / rate ) *(Math.pow(1+rate,year)-1);

	return invest;
}






}
