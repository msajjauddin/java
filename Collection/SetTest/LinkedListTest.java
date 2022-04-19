
import java.util.*;
class LinkedListTest {	//make sure that you dont name class as a LinkedList only it will not compile

	public static void main(String[] args){
	//making Object of LinkedList Class which implements List interface and List extends Collection
	//interface and Collection extends Iterable interface
	//var is replaces what is on right side dataype to the left side at the time of compilation
	 	var list1 = new LinkedList<Interval>();
		list1.add(new Interval(4,34));
		list1.add(new Interval(5,55));
		list1.add(new Interval(6,45));
		list1.add(new Interval(7,30));

		list1.add(new Interval(8,33));
		list1.add(new Interval(9,10));
		//suppose now i want to access all the elements inside the list1 of type LinkedList
		//our LinkedList implements List and List extends Collection interface and Collection interface extends Iterable 
		//and inside Iterable we have Iterator and for each and all those stuff which help us to access list elements one by
		//one
		//
		for(var entry : list1)
			System.out.println(entry);
		
		System.out.println("---------------");
		System.out.printf("Third Interval : %s%n,", list1.get(2));
		//list1.get(2)->this method will get value at index 2


	}

		//here var will look at right side and figure out  which type of data list1 use from its declaration 
	//compiler will replace var with Interval data type
	//
	//IMP Note->1.ArrayList allow us to enter duplicate values
	//	2.ArrayList maintains insertion order means it will print exactly how you entered values
	//	3.ArrayList works on indexing mechanism
	//	disadvantages of LinkedList->
	//	1.it is Slow in execution means it requres more time for operation
	//	2.it takes  more memory space
	//	3.most rarely used Data Structure in java but most taught DS
	//


}

