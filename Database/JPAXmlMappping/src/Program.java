import shopping.*;
import javax.persistence.*;

class Program {

	public static void main(String[] args) throws Exception {
		var emf = Persistence.createEntityManagerFactory("ShopPU");
		var em = emf.createEntityManager();
		if(args.length == 0){
			var query = em.createQuery("SELECT p FROM ProductEntity p", ProductEntity.class);
			var entities = query.getResultList();
			for(var entity : entities)
				System.out.printf("%d\t%.2f\t%d%n", entity.getProductNo(), entity.getPrice(), entity.getStock()); 
		}else{
			int id = Integer.parseInt(args[0]);
			var product = em.find(ProductEntity.class, id);
			if(product != null){
				var orders = product.getOrders();
				for(var order : orders)
					System.out.printf("%s\t%d\t%tF%n", order.getCustomerId(), order.getQuantity(), order.getOrderDate());
			}else{
				System.out.println("No such product!");
			}
		}
		em.close();
	}
}

