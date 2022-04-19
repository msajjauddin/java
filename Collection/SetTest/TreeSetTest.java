
import java.util.*;

class TreeSetTest {

		static class IntervalComparision implements Comparator<Interval> {
			
			public int compare(Interval x, Interval y) {
				return x.getSec() - y.getSec();
			}

		}


	//creating object of TreeSet Class of type Interval (generic) 
	public static void main(String[] args){
		var set1 = new TreeSet<Interval>(new IntervalComparision());
		set1.add(new Interval(1,30));
		set1.add(new Interval(2,50));
		set1.add(new Interval(1,10));
		set1.add(new Interval(3,30));
		set1.add(new Interval(4,40));
		set1.add(new Interval(5,50));
		
		//TreeSet uses its own implementation of Comparator operator to evaluate values and place them in small to high order
		//so instead of relying on TreeSet's own logic for Comparator we have override the Comparator & applied our own logic
		//in Comparator implementaion we substracted seconds of one Interval from other so we used asending order only 
		//for seconds

		//TreeSet extends to Iterable idirectly through Set and Collection so we can use for each loop
		for(var value : set1)
			System.out.println(value);
	
		System.out.println("-------------");
		//System.out.printf("Third Interval = %s%n",set1.get();		

		//TreeSet ->it sort out values by using Comparator 
		//1.it does not allow duplicate elements/values
		//2.it does not maintain insertion order but it maintains values in ascending order or lets if values are 
		//starting from 33 ,44 then it maintain them whichever is smaller it places them at first position
		//it does comparision with values
		//3.	


	}


}

