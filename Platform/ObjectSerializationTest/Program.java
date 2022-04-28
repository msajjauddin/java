

public class Program {



	public static void main(String[] args){
	var siteStoreObj = new tourism.SiteStore();
	var site = siteStoreObj.load("CitiZoo");
	if(args.length > 0){
		var visitor = site.getVisitor(args[0]);
		visitor.visit();
		System.out.printf("Welcome %s, your ticket number is %d%n",visitor.getId(), visitor.getTicketNo());
		siteStoreObj.save(site);


	}else {
		var visitors = site.getAllVisitors();
		for(var visitor : visitors){
			
			System.out.printf("%-15s\t%d\t%s%n",visitor.getId(), visitor.getVisitCount(), visitor.getLastVisit());
		}		
	}


	}





}


















