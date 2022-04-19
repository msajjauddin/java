
import java.util.*;

class HashSetTest {

	//creating object of HashSet Class of type Interval (generic) 
	public static void main(String[] args){
		var set1 = new HashSet<Interval>();
		set1.add(new Interval(1,10));
		set1.add(new Interval(2,20));
		set1.add(new Interval(3,30));
		set1.add(new Interval(4,40));
		set1.add(new Interval(5,50));
		set1.add(new Interval(5,50));	
		//HashSet extends to Iterable idirectly through Set and Collection so we can use for each loop
		for(var value : set1)
			System.out.println(value);
	
		System.out.println("-------------");
		//System.out.printf("Third Interval = %s%n",set1.get();		

		//HashSet ->1.it does not allow duplicate elements/values
		//2.it does not maintain insertion order
		//3.	


	}


}

