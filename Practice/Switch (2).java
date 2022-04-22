
 class  demo1{
	
	private int x;
	private int y;
	public demo1(int x,int y){
	this.x=x;
	this.y=y;
	}
	public static int sum(int x, int y){
	return x+y;
	} 
	public void display(){
	 System.out.println("value of x = "+x);
	 System.out.println("value of y ="+y);
	}
}
class demo2 extends demo1{
	private int z;
	public demo2(int x,int y,int z){
	super(x,y);
	this.z=z;
	}
	public void display(){
	 
//	 System.out.println("value of x = "+x);
//	 System.out.println("value of y =" +y);
	 System.out.println("value of z = "+z);
	}
	






}
class Switch{
	
	public static void main(String[] args){
	System.out.println("welcome my friend");
	demo1 s=new demo1(1,2);
        s.display();
	int sum= demo1.sum(2,5);
	System.out.println("static method sum called on class ="+sum);
	demo2 d1= new demo2(3,4,8);
	System.out.println("result of overridden method display"+d1.display());
		
}

}
