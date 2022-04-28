class Program2 {

	//now lets make an function that just takes 3 arguments we take first args and check if it is odd or not and return first or 
	//second based on it 
 	public static Object select(int index, Object first, Object second){
		if(index % 2 != 0)
			return first;
		return second;
	}
	


	public static void main(String[] args){
		
		if(args.length > 0){
		int s = Integer.parseInt(args[0]);
		String ss = (String)	select(s,"Monday", "Sunday");
		System.out.printf("Selected String = %s%n", ss);

		double sd = (double)	select(s, 3.14, 5.14);
		System.out.printf("Selected double = %s%n", sd);

		Interval sf = (Interval)select(s, new Interval(3,40), new Interval(5,45));
		System.out.printf("Selected Interval = %s%n", sf);
		System.out.println("---------------------");
		double ff =(double)  select(s,3.14, "double");


		

		}


	}
}
