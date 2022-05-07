
package classic.web.app;

import java.sql.*;

public class InvoiceEntry{

	private int productNo;
	private int quantity;
	private Date orderDate;

	public InvoiceEntry(ResultSet rs ) throws SQLException{
		productNo= rs.getInt("pno");	
		quantity= rs.getInt("qty");
		orderDate= rs.getDate("ord_date");	

	}

	public int getProductNo(){ return productNo; }

	public int getQuantity() { return quantity; }

	public Date getOrderDate() { return orderDate; }


}
































