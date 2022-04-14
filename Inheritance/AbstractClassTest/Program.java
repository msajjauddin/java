
import banking.*;  //import all types which belong to banking package

class Program{


	public static void main(String[] args){
	//now first open current account throught banker
	Account jack = Banker.openCurrentAccount();
	jack.deposit(20000);

	//now open a saving account
	Account jill = Banker.openSavingAccount();
	jill.deposit(15000);

	System.out.printf("Jack's Account Number is %d and Jacks Balance is %.2f %n", jack.getAccNo(), jack.getBalance());
	System.out.printf("Jill's Account Number is %d and Jill's Balance is %.2f %n", jill.getAccNo(), jill.getBalance());

	try{
	double amount = Double.parseDouble(args[0]);
	jill.transfer(amount,jack);
	}catch(InsufficientFundsException e){
	System.out.println("Payments failed due to lack of funds!");
	}catch(Exception e){
	System.out.printf("Error : %s %n",e);
	}
	System.out.printf("Jack's Account Number is %d and Jacks Balance is %.2f %n", jack.getAccNo(), jack.getBalance());
	System.out.printf("Jill's Account Number is %d and Jill's Balance is %.2f %n", jill.getAccNo(), jill.getBalance());


	}


}
