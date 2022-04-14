class Program{

	
	public static void main(String[] args){
		//creting object of Interval Class
		Interval a = new Interval(4,5);
		Interval b = new Interval(3,20);
		Interval c = new Interval(2,125);
		Interval d = b;

		System.out.printf("Interval a = %s %n",a.toString());
		System.out.printf("Interval b = %s %n",b);
		System.out.printf("Interval c = %s %n",c);	
		System.out.printf("Interval d = %s %n",d);
		System.out.println("----------------");
		System.out.printf("a is identical to b : %b%n", a==b);	
		System.out.printf("a is identical to c : %b%n", a==c);	
		System.out.printf("d is identical to b : %b%n", d==b);		
		System.out.println("----------------");

		
		System.out.printf("a is equals to b : %b%n",a.hashCode()==b.hashCode() && a.equals(b));


		System.out.printf("a is equals to c : %b%n",a.hashCode()==c.hashCode() && a.equals(c));


		System.out.printf("d is equals to b : %b%n",d.hashCode()==b.hashCode() && d.equals(b));
	
		
		System.out.println("----------------");
	/*	//System.out.printf("Interval a = %s %n",a.toString());
		System.out.printf("hashcode a = %s %n",a.hashCode());
	
		System.out.printf("hashcode b = %s %n",b.hashCode());
		System.out.printf("hashcode c = %s %n",c.hashCode());
	
		System.out.printf("hashcode d = %s %n",d.hashCode());
	*/
	
	
	
		b.hashCode();


	}



}
