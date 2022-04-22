
interface Filter{
	boolean allowed(int a);
}
class oddFilter implements Filter {
	public boolean allowed(int a){
	  return  a % 2 != 0;
	}
}
class EvenFilter implements Filter{
	public boolean allowed(int a){
	  return  a % 2 == 0;
	}
}
class lessThan5 implements Filter{
	public boolean allowed(int a){
	  return  a < 5;
	}
}
class Algorithm {
	public static void printIf(int[] arr, Filter f){
	for(int val : arr){
		if(f.allowed(val)){
			System.out.printf("%d ",val);
		}
	}
	System.out.println();
	}
}
/*
class SomeClass implements Filter {
	public boolean allowed(int a){
		return Program::chekcEven(a);
	}
} */

class Program {





	static int[] num = {1,2,3,4,5,6,7,8,9,10};

	public static void main(String[] args){
	System.out.printf("All numbers : ");
	Algorithm.printIf(num, Program::checkEven);
		




	}

	public static boolean checkEven(int a){
	return  a % 2 == 0;
	}


}
