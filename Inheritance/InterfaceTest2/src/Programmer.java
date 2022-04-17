package taxation;

class Programmer implements taxPayer {

	private int lineOfCodes;

	public Programmer(int count){
	lineOfCodes = count;
	}



	double annualIncome(){
	return 300000 + 0.25 * lineOfCodes;
	}



}
