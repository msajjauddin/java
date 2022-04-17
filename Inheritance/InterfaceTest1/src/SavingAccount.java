package banking;


final class SavingAccount extends Account implements Profitable {

	//a field declared with final modifier can not be reassigned
	static final double MIN_BALANCE = 5000;


	//constructor
	 SavingAccount(){
	balance = MIN_BALANCE;
	}




	//overriding two methods of Account class
	
	public void deposit(double amount){
		balance += amount;
	}

	public void withdraw(double amount) throws InsufficientFundsException {
		if(balance - amount < MIN_BALANCE)//if you are withdrawing money from account minimum balance 5000 should be thethere
			throw new InsufficientFundsException();
		balance -= amount;

	}


	public double interest(int months){
	return balance * months * MIN_RATE / 1200;

	}


}





