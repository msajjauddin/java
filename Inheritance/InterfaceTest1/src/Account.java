
//A class declared with abstract modifier can not be instantiated
//and such class can only be used as super class for other subclasses

package banking;

public abstract class  Account {
	long accNo;	//becauuse acc no are long
	protected double balance;	//declared protected because we want to manipulate this in subclasses

	//we are goona only use getters not setters because users will only able to see theier account number and balance
	public long getAccNo(){
	return accNo;
	}
	public double getBalance(){
	return balance;
	}

	//defining abstract method whose implementation we will provide in subclass because in subclasses current acc and saving acc
	//they have their own terms and condition for withdrawing and depositing funds
	public abstract void deposit(double amount);

	public abstract void withdraw(double amount) throws InsufficientFundsException;

	//now here we have common method which is transfer funds both in current account and saving account 
	//logic for money transfer is same for current acc and saving acc so why to repeat this method in subclass instead define and
	//implement in super class because it is common for all types of account
	//and also make below method final because no one will able to implement it again in subclass 
	//and by doing this we are making it non virtual and java says all methods are by default virtual and support dynamic binding
	//implecitly without doing anything ex-> so when you override a super class method in subclass and make a object of subclass
	//and call this method then java will call overriden method from subclass because all methods are virtual by default in java
	//so no need to declare it virtual and this is how dynamic binding happens implicitly
	

	//Actually we are also throwing exception of type Insufficintbalance because there might possibility that required balance is
	//not there in account to transfer and this exception will be handled by caller of these method 
	public final void transfer(double amount, Account that) throws InsufficientFundsException {
		if(this == that)
			throw new IllegalTransferException();
		this.withdraw(amount);
		that.deposit(amount);
	}
	/*
	now understanding how transfer method is executing is very important 
	transfer method taking two arguments one in amount to be transferred and other is whome to transfer this amount
	look consider you have created two objects of saving account one is jack and other is jill 
	->now lets consider both have some balance in their account of respective objects
	->so now you goona call transfer method from one object and passing amount and object to whome you want to transfer money
	->as per example jack wants to send money to jill then how he will do
	->jack.transfer(8000,jill); so now this is nothing but jack itself and jill we passed and got into that reference in method 
	defination
	->now suppose some idiot goes to bank and he wants to transfer money from his account to himself or his account in same bank
	is that possible no so we goona check if someone passed object of himself or not
	->example jack.transfer(800,jack) ->no thats not possible and it will immediatly throw exception
	this.withdraw(amount) ->jack.withdraw(amount)
	that.deposit(amount) ->jill.deposit(amount)
	taking money from jack and depositing in jills account thats set.



	*/
	
}




