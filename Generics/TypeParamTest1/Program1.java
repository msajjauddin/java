class Program1 {

	//now lets make an function that just takes 3 arguments we take first args and check if it is odd or not and return first or 
	//second based on it 
	public static String select(int index, String first, String second){
		if(index % 2 != 0)
			return first;
		return second;
	}
	
	public static double select(int index, double first, double second){
		if(index % 2 != 0)
			return first;
		return second;
	}

	public static Interval select(int index, Interval first, Interval second){
		if(index % 2 != 0)
			return first;
		return second;
	}




	public static void main(String[] args){
		
		if(args.length > 0){
		int s = Integer.parseInt(args[0]);
		String ss = select(s,"Monday", "Sunday");
		System.out.printf("Selected String = %s%n", ss);

		double sd = select(s, 3.14, 5.14);
		System.out.printf("Selected double = %s%n", sd);

		Interval sf = select(s, new Interval(3,40), new Interval(5,45));
		System.out.printf("Selected Interval = %s%n", sf);
		//double ff = select(s,3.13, "double");


		//this program is example of type safe type but here code duplication 
		//so it is not a generics function
		//a function called generic is when a it support both type safety and support differenct data types in just one 
		//function 
		//above is type safed function but does not support different data types
		//
		//

		}


	}






}
