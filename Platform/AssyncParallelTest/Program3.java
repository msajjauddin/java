

import java.util.stream.IntStream;
import java.util.concurrent.CompletableFuture;

class Program3 {

	static class Computation {
		public long compute(int first, int last){
		return	IntStream.range(first, last + 1 )
			.parallel()	//this will split subsequent iterations across available processors/cores
			.mapToLong(worker::doWork)
			.sum();
		}
	public CompletableFuture<Long> computeAsync(int first , int last){
	
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



}







