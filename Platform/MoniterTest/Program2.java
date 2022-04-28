
class Program2 {
	
	static class JointAccount{
	
		private int balance = 0;

		public int getBalance(){
		return balance;
		}

		public boolean withdraw(int amount){
			 boolean flag = false;
			 synchronized(this){
			if(balance >= amount){
				worker.doWork(amount / 500);	//we are trying to simulate that withdrawing money will take some
								//time in seconds  so we are calling doWork method which will consume
								//some time according to some inupt values
				balance -= amount;
				flag = true;
			}
		 }
			return flag;
		}

		public synchronized void deposit(int amount)  {
			worker.doWork(amount / 500);	
			balance += amount;
			this.notify();
		}

		

	}
	


	public static void main(String[] args) throws Exception{
	var account = new JointAccount();	
	account.deposit(5000);
	System.out.println("Joint Account opened for Jack and Jill");
	System.out.printf("the balance in Account is %d%n", account.getBalance());
	//now we have to create a new thread for Jack and Jill will be our main thread
 	var child = new Thread( ()-> {
			System.out.println("Jack is withdrawing 3000 money");
				if(account.withdraw(5000) == false){
					System.out.println("Jack(child) failed to withdraw 3000 Rupess");
				}
				 else{
					System.out.println("Jack(child) Sucessfull to withdraw  Rupess");
					}
	});
			
	child.start();
	System.out.println("Jill(Main thread) is withdrawing 4000 money");
	if(account.withdraw(5000) == false )
		System.out.println("Jill failed to withdraw 4000 Rupess");
	else{
		System.out.println("Jill Sucessfull to withdraw  Rupess");
	
	}
	child.join();

	System.out.printf("current available Balance : %d%n",account.getBalance());




	}



}









