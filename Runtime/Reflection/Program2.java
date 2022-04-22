import java.util.*;

class Program2 {


	public static void printAsxml(Object info){	//print as xml
	//System.out.printf("<Item>%n");
		var c = info.getClass();
		System.out.printf("<%s>%n", c.getSimpleName());
		for(var f : c.getDeclaredFields()){
			System.out.printf(" <%s>", f.getName());
			try {
				f.setAccessible(true);
				System.out.printf("%s",f.get(info));
			}catch(Exception e) {
				System.out.print("Error");
			}
			System.out.printf(" </%s>%n",f.getName());

		}
		System.out.printf("</%s>%n", c.getSimpleName());	
		System.out.println();
	}




	public static void main(String[] args){
		System.out.printf("Welcome %s!%n",System.getProperty("user.name"));

		printAsxml(new Item("printer", "canon"));
		printAsxml(new Customer("Rimanshu",100000,5));
	

	
	}

}
