
package tourism;

import java.io.*;
import java.util.*;


public class Site implements Serializable {

	String name;
	private List<Visitor> visitors;

	public Site(String id){
	name = id;
	visitors = new ArrayList<Visitor>();
	}

	public List<Visitor> getAllVisitors() { return visitors; }

	public Visitor getVisitor(String name) {
	return visitors.stream()
			.filter( (v) -> v.id.equals(name))
			.findFirst()
			.orElseGet(
				() -> {
				Visitor visitor = new Visitor(name);
				visitors.add(visitor);
				return visitor;
				}	
				);
	}
		






}















