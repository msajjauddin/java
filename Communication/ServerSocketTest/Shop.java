
import java.io.*;
import java.util.*;

//Builder Pattern Design->where you dont let user directly create a Object of this class intead you provide some method which will 
//validate some data and give back object of class
class Shop {

	private Properties items;

	private Shop(Properties data){
		items = data;
	}

	public static Shop open(String doc){
		try(var input = new FileInputStream(doc)){
			var p = new Properties();
			p.loadFromXML(input);
			return new Shop(p);
		}catch(Exception e){
			return null;
		}
	}

	public String getItemInfo(String name){
		return items.getProperty(name);
	}



}
















