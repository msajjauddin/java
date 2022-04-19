
//because we are creating generic class so we put <v> there so this class can work with any data type
class SimpleStack<V> {

	private Node top;

	//inner (non-static) member class
	////you can create instance of these class and also access non static members
	class Node {
	V value;
	Node below;
	
	Node(V val){
	value = val;
	below = top;
	}


	}

	public void push(V value){
		top = new Node(value);
	}

	public V pop() {
		V result = top.value;
		top = top.below;
		return result;
	}
	
	public boolean empty(){
		return top == null;
		//return top == null;
	}





}
