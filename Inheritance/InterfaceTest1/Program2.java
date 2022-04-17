import banking.*;

class Program2 {

	private static void payAnnualInterest(Account[] list){

				System.out.println("********");
		for(Account acc : list){

				System.out.println("********");
			if(acc instanceof Profitable p){
				System.out.println("********");
				//now SavingAccount reference type is Account type and by Account type we are only able to access 
				//methods of Account type which are overriden in SubClasses other than that we wont be able to 
				//access any other but we want interest method which is coming from Profitable interface
				//method now we have to downcast it Subclass type but here but notice subclasses are not made public
				//so we cant do that too so opion remained is sidecasting account object/reference type to Profitable
				//type so through reference of Profitable type we are accessing interest method without accessing 
				//Subclass Reference/object 
				//sidecasting
				//Profitable p = (Profitable)acc;
				double i = p.interest(12);
				acc.deposit(i);
			}
		}
	}


	public static void main(String[] args){			

		 Account[] bank = new Account[5];
		 bank[0] = Banker.openSavingAccount();
		 bank[0].deposit(5000);
		 bank[1] = Banker.openCurrentAccount();
		 bank[1].deposit(20000);										                 		bank[2] = Banker.openSavingAccount();
		 bank[2].deposit(25000);												                 bank[3] = Banker.openCurrentAccount();
		 bank[3].deposit(40000);
                 bank[4] = Banker.openSavingAccount();													 bank[4].deposit(45000);
	
		payAnnualInterest(bank);

		 for(Account acc : bank){
			 System.out.printf("%d\t%.2f%n", acc.getAccNo(), acc.getBalance());
					}


	
	/*
		Account[] accounts = new Account[6];
	//accounts[0] = new CurrentAccount();
	for(int i = 0; i<accounts.length; ++i){
		if(i==0){
		accounts[i] = Banker.openCurrentAccount();
		}
		else if(i%2 == 0){
		accounts[i] = Banker.openSavingAccount();
		}
		accounts[i] = Banker.openCurrentAccount();
	}


	accounts[0].deposit(5000);
	accounts[1].deposit(20000);
	accounts[2].deposit(15000);
	accounts[3].deposit(22000);
	accounts[4].deposit(25000);

	payAnnualInterest(accounts);
		
	for(Account acc : accounts)
		System.out.printf("%d\t %.2f%n",acc.getAccNo(),acc.getBalance());

	*/
	





	}


}
