class Sample1 {

	public static void main(String[] args){

	String a = "animal";
	String b = "aniMal";
	if(a.equals(b)){
	System.out.println("******");
	
	}else {
		System.out.println("not equal");
	}
	System.out.printf("hashcode a = %d \t%n",a.hashCode());
	
	System.out.printf("hashcode b = %d \t%n",b.hashCode());

	
	System.out.println("---------------------------------");

	Sample2 obj1 = new Sample2();
	obj1.a="animal";

	Sample2 obj2 = new Sample2();
	obj2.a="animal";

	System.out.printf("hashcode obj1 %s  = %d \t%n",obj1.a,obj1.hashCode());
	
	System.out.printf("hashcode obj2 = %d \t%n",obj2.hashCode());

	
	}

	
}
	class Sample2 {
	public String a;


	}


