import java.io.*;
import java.net.*;

class Program {
	
	/*
	  Basic steps for implementing a TCP client
	  1. Open a stream socket connected to server's endpoint
	  2. Use input/output streams of above socket to exchange data with the server
	  3. Close the above socket
	*/

	public static void main(String[] args) throws Exception {
		String item = args[1].toLowerCase();
		int quantity = Integer.parseInt(args[2]);
		var client = new Socket(args[0], 4040); //step 1
		var input = client.getInputStream(); //step 2
		var output = client.getOutputStream();
		var reader = new BufferedReader(new InputStreamReader(input));
		var writer = new PrintWriter(new OutputStreamWriter(output), true);
		System.out.println(reader.readLine());
		writer.println(item);
		String response = reader.readLine();
		if(response != null){
			var info = ItemInfo.parseItemInfo(response);
			if(quantity <= info.stock()){
				System.out.printf("Total Payment: %.2f%n", quantity * info.price());
			}else{
				System.out.println("Item out of stock!");
			}
		}else{
			System.out.println("Item not sold!");
		}
		writer.close();
		reader.close();
		client.close(); //step 3
	}
}

