import java.util.Iterator;

class Program1 {
	//Now what is purpose of using iterator interface method is we dont want to pop out/ or delete our nodes once we read them
	//as we were doing in previous directory but here we can avoid that by using iterator interface methods which have implementd
	//them in our SimpleStack class inside a iterator method where we have created a anonymous class and in that anonymous class
	//we have implemented methods of Iterator interface(hasNext(), next()) and inside those method we have written our own logic
	//for getting node details without deleting previous node like we did in previous way
	//
	//IMP note-> notice how we have creating instance of anonymous class -> new Iterator<V>() {..}; 
	//so here anonymous class is one which dont have any name and on that we are implementing Iterator interface
	//and we are returning reference of this instance through our method and catching it var i 
	//var is a new feature introduced in java 10 by using var keywork we can assign any type of data to its variable
	//var has limitation just like it cant be used outside of method body
	//compiler automatically pickups the data type of var by looking at right side of equal to and figuring out which type of
	//data it is
	//
	public static void main(String[] args){
		SimpleStack<String> a = new SimpleStack<String>();
		a.push("Monday");
		a.push("Tuesday");
		a.push("Wednesday");
		a.push("Thursday");
		a.push("Friday");
		a.push("Saturday");
		a.push("Sunday");
//		printStack(
		//instead of var you can also use Iterator but you have to import it from java.util.Iterator package
		for(Iterator i = a.iterator(); i.hasNext();){

		System.out.println(i.next());	
		
		}


		System.out.println("--------------------------------");

	/*
		SimpleStack<Double> b = new SimpleStack<>();
		b.push(33.33);
		b.push(33.33);
	*/	
		 SimpleStack<Interval> b = new SimpleStack<>();
		                 b.push(new Interval(5, 41));
				 b.push(new Interval(6,45));

				 for(Interval i : b)
					 System.out.println(i);

	}



}	
