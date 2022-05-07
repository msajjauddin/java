import sales.*;
import java.rmi.*;

class Program {

	public static void main(String[] args) throws Exception {
		

		var stub = (OrderManager)  Naming.lookup("rmi://localhost:6000/orderManager");
		String customerId = args[0].toUpperCase();
		if(args.length > 2){
			int productNo = Integer.parseInt(args[1]);
			int quantity = Integer.parseInt(args[2]);
			try{
				int orderNo = stub.placeOrder(customerId, productNo, quantity);
				System.out.printf("New Order Number: %d%n", orderNo);

		
			}catch(Exception e){
				System.out.println("Order failed");
			}


		}else{
			var orders = stub.getOrdersOf(customerId);

			for(var order : orders){
		System.out.printf("%d\t%d\t%s%n", order.getProductNo(), order.getQuantity(), order.getOrderDate());		
			}



		}





	}
}

