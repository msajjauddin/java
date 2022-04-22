
import java.util.*;

	/*A record is a reference type which on instantiation produces a value-like immutable
	 * object (whose state can not be modified). Java compiler automatically generates a class
	 *for a record type which contains final instance fields corresponding to the parameters
	 *in the declaratoin of that record type along with
	 *(a) a constructor gor initializing those fields from its parameters
	 *(b) methods for getting values of those fields
	 *(c) overrides for hasCode(), equals() and toString() methods of java.lang.Object
	 */



	record Item(String name, String brand) {};


	record Customer(String id, double purchase, int rating) implements Comparable<Customer> {
	public int compareTo(Customer that) {
		return id.compareTo(that.id);
	}	

	};


	public class Shop {

		public Item[] getItems() {
			return new Item[] {
			new Item("cpu", "intel"),
			new Item("ssd", "samsung"),
			new Item("mouse", "logitech"),
			new Item("monitor", "samsung"),
			new Item("motherboard", "intel"),
			new Item("ddr", "samsung"),
			new Item("keyboard", "logitech"),
			new Item("ssd", "seagate"),
			
			};
		}

		public Collection<Customer>  getCustomer() {
			var customers = new ArrayList<Customer>();
			customers.add(new Customer("jack", 45000, 4));

			customers.add(new Customer("jill", 25000, 3));
			customers.add(new Customer("john", 50000, 2));
			customers.add(new Customer("Amar", 90000, 5));
			customers.add(new Customer("Sanket", 60000, 4));
			customers.add(new Customer("Rushikesh", 35000, 3));
			customers.add(new Customer("Rimanshu", 55000, 4));
			customers.add(new Customer("Chagan", 65000, 5));
			
			return customers;
		}


	}










