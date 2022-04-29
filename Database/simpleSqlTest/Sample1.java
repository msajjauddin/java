
import java.sql.*;

class Sample1 {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/sales";
		String username = "root";
		String password = "Root@1234";
		
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("*************Connection established**************");
		//now we want to get all the elements from tables;
		
		String s_query = "select * from orders";
		Statement stmt = con.createStatement();



/*		try{

		}catch(SQLException e){
			
		}
		
*/


	}



}









