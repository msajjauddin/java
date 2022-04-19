
import java.util.*;

class Program {

	
	public static void main(String[] args){
		//var map1 = new HashMap<String,Interval>();
		
		var map1 = new TreeMap<String,Interval>();
		
		map1.put("Monday", new Interval(4,44));
		map1.put("Tuesday", new Interval(5,44));
		map1.put("Wednesday", new Interval(6,44));
		map1.put("Thursday", new Interval(7,44));
		map1.put("Friday", new Interval(8,44));
		map1.put("Saturday", new Interval(9,44));
		
		map1.put("Sunday", new Interval(10,44));

		var ip = new Scanner(System.in);
		System.out.print("key: ");
		String key = ip.next();
		Interval val = map1.get(key);
		if(val != null)
			System.out.printf("Value = %s%n", val);
		else {
			for(var entry : map1.entrySet())

			System.out.printf("%-12s%8s%n", entry.getKey(), entry.getValue());
		}





	}



}

