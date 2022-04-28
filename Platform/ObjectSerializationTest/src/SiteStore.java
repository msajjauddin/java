
package tourism;

import java.util.*;
import java.io.*;

public class SiteStore {

	public boolean save(Site site){	
		String doc = site.name + ".store";
		try(var output = new ObjectOutputStream(new FileOutputStream(doc))){
			output.writeObject(site);	//serializing object->converting object into series of byters and store that
							//into the file
			return true;
		}catch(Exception e){
			return false;
		}
	}

	public Site load(String name){
	String doc = name + ".store";
	try(var input = new ObjectInputStream(new FileInputStream(doc))){
		return (Site)input.readObject();	//deserialize

	}catch(Exception e){
		return new Site(name); 
	}


	}







}















