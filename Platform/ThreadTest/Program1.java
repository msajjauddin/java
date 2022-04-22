

class Program1 {
	
	private static String client;

	private static void handleJob(int jno){
		System.out.printf("Thread<%x> has accepted job<%d> for client<%s>%n",Thread.currentThread().hashCode(),jno, client);
		worker.doWork(10 * jno);
		System.out.printf("Thread<%x> has finished job<%d> for client<%s>%n",Thread.currentThread().hashCode(),jno, client);
	}


	public static void main(String[] args) throws Exception{
		int n = args.length > 0 ? Integer.parseInt(args[0]) : 1;
		client = "Jack";
		handleJob(2);
		client = "Jack";
		handleJob(4);


	}


}









