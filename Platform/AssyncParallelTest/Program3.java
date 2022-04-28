

import java.util.stream.*;
import java.util.concurrent.*;

class Program3 {

	static class Computation {
		public int compute(int first, int last){
		return	IntStream.range(first, last + 1 )
			.parallel()	//this will split subsequent iterations across available processors/cores
			.mapToInt(worker::doWork)
			.sum();
		}
	public CompletableFuture<Integer> computeAsync(int first , int last){
	
			return CompletableFuture.supplyAsync( () -> compute(first, last));
	}

	}


	private static CompletableFuture<Void> doComputation(int limit){
	System.out.print("Computing......");
	var c  = new Computation();
	var t1 = System.nanoTime();
	return c.computeAsync(1, limit)
				.thenAccept( r -> {
					var t2 = System.nanoTime();
					System.out.println("Done!");
					System.out.printf("Result = %d, computed in %.3f seconds.%n", r, (t2 - t1) / 1e9);	
					});		

	}


	public static void main(String[] args)throws Exception{
	int n = args.length > 0 ? Integer.parseInt(args[0]) : 10;
	var job  = doComputation(n);
	while(!job.isDone()){	
		System.out.print(".");
		Thread.sleep(500);
	}
	}



}	//Program features->
	/* 1. -> job.isDone() method tell us if the executer of the job has finished the task if yes then it will return true if not 
	 * then return false
	 * 2. -> IntStream.range(first, last) this method of InstStream class will return a continuous stream of between that range 
	 * provided in arguments as first and last
	 *
	 *3. -> .parallel() ->Parallel streams enable us to execute code in parallel on separate cores. 
	 *	The final result is the combination of each individual outcome.
	 *	However, the order of execution is out of our control. It may change every time we run the program:
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 */







