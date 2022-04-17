class Program3 {

	//now lets make an function that just takes 3 arguments we take first args and check if it is odd or not and return first or 
	//second based on it 
 	private static <T> T select(int index, T first, T second){
		if(index % 2 != 0)
			return first;
		return second;
	}
	
 	private static <T extends Comparable<T>> T  select(T first, T second){
		if(first.compareTo(second) > 0)
			return first;
		return second;
	}
	//by extending our T which might be String or Wrapper class Double to Comparable Class in java.lang package now
	//we can use compareTo method of that Comparable class
	//but for Interval Class which is our user defined type then we have to override compareTo method to compare two objects of
	//same type

	public static void main(String[] args){
		
		if(args.length > 0){
		int s = Integer.parseInt(args[0]);
		String ss = 	select(s,"Monday", "Sunday");
		System.out.printf("Selected String = %s%n", ss);

		double sd = 	select(s, 3.14, 5.14);
		System.out.printf("Selected double = %s%n", sd);

		Interval sf = select(s, new Interval(3,14), new Interval(5,14));
		System.out.printf("Selected Interval = %s%n", sf);
		System.out.println("---------------------");
	//	double ff =  select(s,3.14, "double");
		}
		else{
		String ss = 	select("Monday", "Sunday");
		System.out.printf("Selected String = %s%n", ss);
		double sd = 	select( 3.14, 5.14);
		System.out.printf("Selected double = %s%n", sd);
		Interval sf = select( new Interval(3,14), new Interval(5,14));
		System.out.printf("Selected Interval = %s%n", sf);

		}

		//this program is example of type safe type but here code duplication 
		//so it is not a generics function
		//a function called generic is when a it support both type safety and support differenct data types in just one 
		//function 
		//above is type safed function but does not support different data types
		//
		//

		


	}
}
