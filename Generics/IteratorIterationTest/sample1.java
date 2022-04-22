import java.util.*;

	class sample1 {

	

	public static void main(String[] args){

		var a = new sample1();
		var b = a.iterator();

	}


		public Iterator iterator(){
			
			return new Iterator(){
			
			private Node current = 
			public boolean hasNext() {
				return current != null;
						}
			
			public V next(){

				V result = current.value;							 			 				current = current.below;
				return result;
													 					}
			};


		}




	}

