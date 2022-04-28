
import java.io.*;
import java.net.*;


class Program1 {


	/*Basics steps for implementing a TCP server
	 * 1. Open a listner socket and bind it to a well-known local endpoint
	 * 2.Use above socket to wait for client's connection request and accept the corresponding 
	 * stream socket
	 * 3.Exchange data with the client using input/output stream of above stream socket
	 * 4.close the above stream socket and go to step 2
	 */
	

	public static void main(String[] args) throws Exception {
		var listener = new ServerSocket(4040); //step 1
		service(listener);

	}

	
	private static void service(ServerSocket listener)throws Exception{
		var shop = Shop.open("store.xml");
		//infinite for loop
		for(;;){
			var client = listener.accept(); //step 2 accept connection connection request and return object of stram socket which
						//which is linked with the client
			client.setSoTimeout(20000);
			var input = client.getInputStream();//step 3
			var output = client.getOutputStream();
			var reader = new BufferedReader(new InputStreamReader(input));
			var writer = new PrintWriter(new OutputStreamWriter(output));

			try{
				writer.println("Welcome to ACS InfoTech Computers");
				writer.flush();
				String item = reader.readLine();
				String info = shop.getItemInfo(item);
				if(info != null){
					writer.println(info);
					writer.flush();
				}

			}catch(Exception e){
			writer.close();
			reader.close();
			client.close();	//step 4
			}
		}
	}












}





































