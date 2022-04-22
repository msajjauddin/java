
class program {


	public static double invest(double p, int year, boolean isRisky){
		float interest = isRisky ? 0.08f : 0.06f;
		return (p / interest) * (Math.pow(1 + interest, year) - 1);
	}


	public static void main(String[] args){
		System.out.println("Welcome Investor");
		double amount	= Double.parseDouble(args[0]);
		int 	year	= Integer.parseInt(args[1]);
		boolean isRisky = Boolean.parseBoolean(args[2]);
		
		System.out.printf("future value of investment is  %.2f%n", invest(amount,year,isRisky));
	}

}






