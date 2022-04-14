
class Program {


	public static void main(String[] args){
/*		Dog d = new Dog();
		d.eat();
		Cat c = new Cat();
		c.eat();
*/
		Cat d = new Cat();
		doAnimalStuff(d);
			


	}

	public static void doAnimalStuff(Animal animal){
		animal.makeNoise();
		if(animal instanceof Dog){

		Dog d = (Dog)animal;
		d.growl();
		}
			



	}



}

