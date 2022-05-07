
package sales;

import shopping.*;
import java.rmi.*;
import java.util.*;
import javax.persistence.*;

public class OrderManagementService extends java.rmi.server.UnicastRemoteObject implements OrderManager {

	static final int PORT = 6000;

	public OrderManagementService() throws RemoteException {
		super(PORT);
	}

	public int placeOrder(String customerId, int productNo, int quantity) throws RemoteException {

		var emf = Persistence.createEntityManagerFactory("SalesPU");
		var em = emf.createEntityManager();
		try{
			var tx = em.getTransaction();
			tx.begin();
			var ctr = em.find(CounterEntity.class, "orders");
			int orderNo = ctr.getNextValue() + 1000;
			var order = new OrderEntity();
			order.setOrderNo(orderNo);
			order.setCustomerId(customerId);
			order.setProductNo(productNo);
			order.setQuantity(quantity);
			order.setOrderDate(new Date());
			em.persist(order);
			tx.commit();
			return orderNo;
		}finally{
			em.close();
		}
	}


	public List<OrderEntity> getOrdersOf(String customerId) throws RemoteException{
	var emf = Persistence.createEntityManagerFactory("SalesPU");
	var em = emf.createEntityManager();

	try{
		var query = em.createQuery("SELECT e FROM OrderEntity e WHERE e.customerId=?1",OrderEntity.class);
		query.setParameter(1, customerId);
		return query.getResultList();

	}finally{
		em.close();
	}

	}

	public static void main(String[] args) throws Exception {
	var naming = java.rmi.registry.LocateRegistry.createRegistry(PORT);
	naming.bind("orderManager", new OrderManagementService());

	}



}



















