class Dog extends Animal implements Killer {


	public void growl(){
	System.out.println("Grrrrrrr");
	}
	
	//overriden method
	public void makeNoise(){
	System.out.println("BHAU BHAU BHAU!!!!!!");
	}

	public void iBite(){
	System.out.println("I am Dog and I Bite!");
	}
}
