import java.util.*;

public class Program {

	public static float safeScheme(int y){
	return y < 3 ? 6 : 8;
	}
		



	public static void main(String[] args){
		var input = new Scanner(System.in);
		System.out.println("Enter payment and number of years");
		double payment = input.nextDouble();
		int years = input.nextInt();
	
		var inv = new Investment(payment, years);	
		double futurePay = inv.futureValue(Program::safeScheme);

		System.out.printf("Future value for riskless investment is %.2f%n",futurePay);
		
System.out.printf("Future value for riskFull investment is %.2f%n",inv.futureValue((t) -> { return 9 + 0.25f * t;}));


	}


}



