

class Program1 {
	//IMP Note-> here SimpleStack<?> is short form of SimpleStack<? extends Object>
	private static void printStack(SimpleStack<?> stack){
		while(!stack.empty())
			System.out.println(stack.pop());

	}

	public static void main(String[] args){
		SimpleStack<String> a = new SimpleStack<String>();
		a.push("Monday");
		a.push("Tuesday");
		a.push("Wednesday");
		a.push("Thursday");
		a.push("Friday");
		a.push("Saturday");
		a.push("Sunday");
		printStack(a);

		System.out.println("--------------------------------");

		SimpleStack<Double> b = new SimpleStack<>();
		b.push(33.33);
		b.push(33.33);
		b.push(33.33);

		printStack(b);
		
		System.out.println("--------------------------------");

		SimpleStack<Object> c = new SimpleStack<Object>();
		c.push("Sunday");
		c.push(333);
		c.push(33.33);
		printStack(c);	
	}



}	
