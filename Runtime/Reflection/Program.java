import java.util.*;

class Program {


	public static void printAsxml(Item info){	//print as xml
	System.out.printf("<Item>%n");
	System.out.printf(" <name>%s</name>%n",info.name());
	System.out.printf(" <brand>%s</brand>%n",info.brand());
	System.out.println("</Item>");
	System.out.println();
	}

	public static void printAsxml(Customer info){

	System.out.printf("<Customer>%n");
	System.out.printf(" <id>%s</id>%n",info.id());
	System.out.printf(" <purchase>%s</purchase>%n",info.purchase());
	System.out.printf(" <rating>%s</rating>%n",info.rating());
	System.out.println("</Customer>");
	System.out.println();

	}

	//look the problem here is every time we have to make a new method which accepts different object perticular classe
	//and from that perticular class we have to call there respective method 
	//so even if we make Object type in method parameter as Object still we have to know which method is there beforeahand to 
	//call that method
	//so in next Program2 we goona see how using reflection concept we can write a single method which can accepts any type of 
	//class and perform operation on that and make xml of data with their metadata

	public static void main(String[] args){
		System.out.printf("Welcome %s!%n",System.getProperty("user.name"));

		printAsxml(new Item("printer", "canon"));
		printAsxml(new Customer("Rimanshu",100000,5));
	

	
	}

}
