
class Program {


	public static void main(String[] args){
/*		Dog d = new Dog();
		d.eat();
		Cat c = new Cat();
		c.eat();
*/
		Cat c = new Cat();
	//	c.eat();
	//	c.makeNoise();
	//	doAnimalStuff(c);
		
		Dog d = new Dog();
		doAnimalStuff(d);	


	}

	public static void doAnimalStuff(Animal animal){
	//	animal.makeNoise();
		if(animal instanceof Dog ){
			
		d.growl();
		
		//	Killer k = (Killer)animal;
		//	k.iBite();
		}
	//	Cat c = (Cat)animal;
		
		//c.eat();
			
	}



}

