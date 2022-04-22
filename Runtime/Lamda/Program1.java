

class Program1 {

	public static void print(){
	System.out.println("i am printing ");
	}

	


	//Lamda funtion (anonymous function) ->no name, no return type , no modifier
	//()-> { System.out.println("i am lambda printing"); }
	//you can only use lamda expression with functional interface
	//lamda is used to implement functional interface in very short and simple manner
	
	//->
	public static void main(String[] args){

	Animal obj = Program1::print;
	System.out.println(obj.toString());
	
	Animal an = new Dog();
	an.printName();
	System.out.println("---------------------");

	Animal a = new Animal(){ 
		public void printName(){
		System.out.println("i am anonymous class method");
		}
	};
	a.printName();
	System.out.println("---------------------");

	Animal a2 = ()-> { System.out.println("i am anonymous class with Lamda Expression method");};
	a2.printName();
	System.out.println("---------------------");
	//here we are using Lamda expression to give implementation for Animal interface method
	//here we have method prototype in Animal interface when we are provoding its implementation we use Lamda expression 
	//for implementation of printName method
		
	SummationI s = (x,y)->  (x+y); 	//we also dont need to use return keyword here compiler do that job for us
	System.out.println("Summation of a + b = "+s.sum(2,2));
	//in lamda we have only single instruction so need to use  paranthesis {}
	System.out.println("---------------------");



	}




}
