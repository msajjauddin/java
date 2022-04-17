package banking;

final class CurrentAccount extends Account {

	public void deposit(double amount){	//bussiness logic
	if(balance < 0)
		amount *= 0.9;	//logic is if balance is negative then we goona deduct 10% of deposit amount and rest will add into 
				//account
	balance += amount;
	}

	public void withdraw(double amount) throws InsufficientFundsException {
		balance -= amount;	//balance = balance - amount;
	}
		
	/*
	 *look 
	 * 
	*/

}

