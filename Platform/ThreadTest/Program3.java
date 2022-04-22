

class Program3 {
	
	//each thread will use saperate value of String stored in client object
	private static ThreadLocal<String> client = new ThreadLocal<>();

	private static void handleJob(int jno){
	System.out.printf("Thread<%x> has accepted job<%d> for client<%s>%n",Thread.currentThread().hashCode(),jno, client.get());
		worker.doWork(10 * jno);
	System.out.printf("Thread<%x> has finished job<%d> for client<%s>%n",Thread.currentThread().hashCode(),jno, client.get());
	}


	public static void main(String[] args) throws Exception{
		int n = args.length > 0 ? Integer.parseInt(args[0]) : 1;
		
	//	handleJob(2);
	//	handleJob(4);
	//	now we want to execute this two job simultaneously /asynchronously
	//	for that we need create one child thread to handleJob task asynchronously

		var child = new Thread(
				() -> { 
					client.set("Jill");
					handleJob(n);
			       	}
				);
		
		child.setDaemon(n >= 10);	//JVM does not wait for daeamon for exit. if main thread completing its task within gi
						//given time then main thread will not wait for child if it taking too much time
		child.start();

		client.set("Jack");
		handleJob(4);	
	




	}


}









