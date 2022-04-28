

package tourism;

import java.util.*;
import java.io.*;

public class Visitor implements Serializable {

	 String id;
	private int visitCount;
	private Date lastVisit;

	private transient long ticketNo;
	//transient means dont include while seriliazing this class object
	
	public Visitor(String name){
		id = name;
	}



	public final  String getId(){ return id; }

	public final int  getVisitCount() { return visitCount; }

	public final Date getLastVisit() { return lastVisit; }

	public final long getTicketNo() { return ticketNo; }

	public void visit(){
		++ visitCount;
		lastVisit = new Date();
		ticketNo = System.currentTimeMillis() % 1000000;

	}

	static final long serialVersionUID = 1L;
	










}















