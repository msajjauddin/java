

import java.util.stream.IntStream;
class Program1 {

	static class Computation {
		public long compute(int first, int last){
		return	IntStream.range(first, last + 1 )
			.mapToLong(worker::doWork)
			.sum();
		}
	}


	public static void doComputation(int limit){
	System.out.println("Computing......");
	var c  = new Computation();
	var t1 = System.nanoTime();
	var result = c.compute(1,limit);
	var t2 = System.nanoTime();
	System.out.println("Done !!!!!......");
	System.out.printf("Result = %d , computed in %.3f seconds %n",result, (t2- t1) / 1e9);




	}





	public static void main(String[] args){
	int n = args.length > 0 ? Integer.parseInt(args[0]) : 10;
	doComputation(n);
	}



}







