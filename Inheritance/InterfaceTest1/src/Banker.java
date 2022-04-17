
package banking;
//banker will be our factory pattern 
public class Banker {

	private static long nid;

	//how we goona initialize this static field also we need to generate unique number for nid
	static{
		long t = System.currentTimeMillis();
		nid = t % 1000000;		//each time when this method is called unique number will generate

	}



	//now we goona make two methods one for currentAccount and other one for SavingAccount making
	public static Account openCurrentAccount(){
		//CurrentAccount acc = new CurrentAccount(); //instead of this line you can also do below line of code
		var acc = new CurrentAccount();	//var is nothing but CurrentAccount here in this case but cound change if there is Saving Account
		acc.accNo  = ++nid + 100000000;
		return acc;
	}

	public static Account openSavingAccount(){
		var acc = new SavingAccount();
		acc.accNo = ++nid + 200000000;
		return acc;
	}


	private Banker(){};

	










}








