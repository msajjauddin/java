class Program {
//this class contains main method


	public static void main(String[] args){
	System.out.println("Welcome Invester");
	
	double amount	= Double.parseDouble(args[0]);
	int 	year	= Integer.parseInt(args[1]);
	//creating object of Investment class
	Investment inv = new Investment(amount,year);
	System.out.printf("your future return on riskless investment is %.2f %n",inv.getInvest());
	//now setting isRisky to true
	inv.setRisk(true);


	System.out.printf("your future return on risky investment is %.2f %n",inv.getInvest());
	


	}


}
