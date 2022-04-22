
 class  demo1{
	
	private int x;
	private int y;
	public static int result;

	public demo1(int x,int y){
	this.x=x;
	this.y=y;
	}
	public static int sum(int x, int y){
	return  result = x+y;
	} 
	public int display(){
	 return result;
	}
}
class demo2 extends demo1{
	private int z;
	public demo2(int x,int y,int z){
	super(x,y);
	this.z=z;
	}
	int t = super.result;
	int r = super.display()
	public int display(){
	 return z;	 
	}
	

}
class Switch{
	
	public static void main(String[] args){
	System.out.println("welcome my friend");
	demo1 d1=new demo1(1,2);
        d1.display();
	System.out.println("--------------------");
	
	int total= demo1.sum(2,5);
	System.out.println("static method sum called on class ="+total);

	System.out.println("--------------------");

	demo2 d2= new demo2(3,4,8);
	System.out.printf("result of overridden method display %d%n", d2.display());
	
}

}
