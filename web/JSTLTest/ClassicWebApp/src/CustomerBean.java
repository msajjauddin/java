package classic.web.app;

import java.io.Serializable;
import javax.sql.*;
import javax.naming.*;
import java.sql.*;
import java.util.*;


public class CustomerBean implements Serializable {

	private String id;
	private String password;

	public final String getId() { return id; }
	public final void setId(String value) { id = value; }

	public final String getPassword() { return password;}
	public final void setPassword(String value) { password = value;}

	public boolean authenticate() throws SQLException, NamingException {

	var naming = new InitialContext();
	var pool = (DataSource) naming.lookup("jdbc/SalesDB");

	try( var con = pool.getConnection()){
		
		var pstmt= con.prepareStatement("select count(cust_id) from customers where cust_id=?, and pwd=?");
		
		pstmt.setString(1,id);
		pstmt.setString(2, password);
		var rs = pstmt.executeQuery();
		rs.next();
		int count = rs.getInt(1);
		if(count == 1)
			return true;
		id = null;
		password = null;
		return false;
		}
	}







}































