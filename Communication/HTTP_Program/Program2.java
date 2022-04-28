import java.net.*;
import java.net.http.*;

class Program2 {

	public static void main(String[] args) throws Exception {
		if(args.length == 0)
			Server.start();
		String item = args[0].toLowerCase();
		int quantity = Integer.parseInt(args[1]);
		URI site = new URI("http://localhost:4000/shopping/" + item);
		var client = HttpClient.newHttpClient();
		var request = HttpRequest.newBuilder()
						.GET()
						.uri(site)
						.build();
		var response = client.send(request, HttpResponse.BodyHandlers.ofString());
		if(response.statusCode() == 200){
			String content = response.body();
			var info = ItemInfo.parseItemInfo(content);
			if(quantity <= info.stock())
				System.out.printf("Total Payment: %.2f%n", quantity * info.price());
			else
				System.out.println("Item out of stock!");
		}else{
			System.out.println("Item not sold!");
		}

	}
}

