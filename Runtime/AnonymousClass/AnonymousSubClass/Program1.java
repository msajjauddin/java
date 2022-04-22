import java.lang.*;

class Program1 {

		public static Runnable runner(){

		return new Runnable(){
			public void run(){
			System.out.println("i am anonymous class which implements runnable interface");
			}
		};

		}
	public static void main(String[] args){
		Animal myAnimal = new Animal();
		myAnimal.makeNoise();

		Animal yeti = new Animal(){	//yeti is none other than bigfoot 
			//creating anonymous subclass of Animal class and writing that class defination right here in 
			//curly braces
		//	@override
			public void makeNoise(){
			System.out.println("grawlneegrawdkfjldskj");
			}

		};

		//now creating a object of anonymous class which implements Runnable interface
		Runnable obj1 = new Runnable(){
			
		//	@override
			public void run(){
			System.out.println("I am anonymous runnable");
			}

		};
		obj1.run();
	
		// there are two ways to create an anonymous class 
		// 1)->creating an object of  anonymous subclass which extends to some class like first case of yeti
		// 2)->creating an object/instance of anonymous subclass which implements a interface like in case of Runnable where
		// we have to override run method in anonymous class 
	
		System.out.println("----------------------");

		Runnable i = runner();
		i.run();

			











	}
		//anonymous allows us to
	//->to create unnameed subclass of some other class like Animal and create one single object of that anonymous class
	//->we can only create object of anonymous class only one time 
	//->and i cant just create object of this anonymous class


}
