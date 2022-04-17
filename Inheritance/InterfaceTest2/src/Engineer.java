package taxation;

public class Engineer implements taxPlayer {
	
	private int projects;

	public Engineer(int count){
		projects = count;
	}
	public double annualIncome(){

	return 600000 + projects * 50000;

	}





}
