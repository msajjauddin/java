import java.net.*;
import java.util.*;
class Server {

	//request format example-> http://localhost:4000/shopping/cpu
	//it automatically creates threads based on requirement
	//10 in server indicates that que must not be greater than 10
	//HTTP Server take cares of multithreading
	public static void start() throws Exception {

		var endpoint = new java.net.InetSocketAddress(4040);
		var server = com.sun.net.httpserver.HttpServer.create(endpoint, 10);
		server.createContext("/shopping",
				client -> { 				
		Shop shop = Shop.open("store.xml");
		String item = client.getRequestURI().getPath().substring(10);
		String info = shop.getItemInfo(item);
		if(info != null) {
			byte[] content = info.getBytes();
			client.sendResponseHeaders(200, content.length);
			var output = client.getResponseBody();
			output.write(content);
			output.close();

		}else{
		client.sendResponseHeaders(404, -1);

		}
				}
				);

		server.start();
	}


}






















