import java.util.*;

class Program {

	public static void main(String[] args){
		System.out.printf("Welcome %s!%n",System.getProperty("user.name"));

		Shop myshop = new Shop();
		if(args[0].equals("items")){
			Item[] items= myshop.getItems();
			Arrays.stream(items)
				.filter(i->i.brand().equals(args[1]))	//we have brand() function inside our Item class which return
									//brand name
				.map(i->i.name())			//we also have name() function inside our Item class which 
									//return name 
				.forEach(System.out::println);					
		}
		else if(args[0].equals("customers")){
			double min = Double.parseDouble(args[1]);
			Collection<Customer> customer = myshop.getCustomer();
			customer.add(new Customer("Amar",98000,5));
			customer.stream()
				.filter(t-> t.purchase() >= min)
				.sorted()
				.map(c-> "*".repeat(c.rating()) + "\t" + c.id())
				.forEach(System.out::println);
		}


	}

}






