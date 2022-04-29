

import java.sql.*;

class Program1 {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/sales";
		String username = "root";
		String password = "Root@1234";


		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("connection established!");
		Statement stmt = con.createStatement();
		if(args.length == 0){
			String s_query = "select pno, price, stock from products";
			ResultSet rs = stmt.executeQuery(s_query);
			while(rs.next()){
				System.out.printf("%d\t%.2f\t%d%n", rs.getInt(1), rs.getDouble(2), rs.getInt("stock") );

			}
			rs.close();
		}else{
			int id = Integer.parseInt(args[0]);
			String u_query = "update products set stock = stock + 5 where pno = ";
			int n = stmt.executeUpdate(u_query+ id);
			if(n == 0)
				System.out.println("No such Product!");


		}
		stmt.close();
		con.close();


	}


}
















