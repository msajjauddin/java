class deviation{
public double value;

}


class Program{
	//this method lets us enter any number of values because ( double... other ) double... will act as an array 
	//so we can calculate average of any numbers
	private static double average(double f, double s, double... other)
	{
		double total =f+s;
		for(double i : other)
		{
			total += i;
		}
		double avg = total/(other.length + 2);
		return avg;
	}
	private static double deviate(double f, double s,deviation d){
		d.value =  (f>s) ? (f-s)/2 : (s-f)/2;

		return average(f,s);
	

	}



	public static void main(String[] args){
	//function that can calculate average:
	System.out.println("Calculate Average method");
	
	System.out.printf(" Average for two double numbers calculation = %.2f %n",average(22.33,55.44));
	
	System.out.printf(" Average for three double numbers calculation = %.2f %n",average(22.33,55.44,88,8));
	
	System.out.printf(" Average for four double numbers calculation = %.2f %n",average(22.33,55.44,88.8,99,8));

		if(args.length > 1){
		double first = Double.parseDouble(args[0]);
	
		double second = Double.parseDouble(args[1]);
		deviation d = new deviation();
		double avg = deviate(first,second,d);	


	System.out.printf(" deviation and average for two double numbers calculation = %.2f %.2f %n",d.value,avg);
	

	}



	}

}
