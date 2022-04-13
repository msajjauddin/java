
import payroll.Employee;	//importing does not mean that we are importing this classes it justs mean that we are expanding names
				//of these classes
import payroll.SalesPerson;


//now in these program classes we goona call all methods through theier respective objects 
//also apply tax to each type

class Program {

	public static double tax(Employee emp){
		double pay = emp.payment();
	return pay > 10000 ? 0.15 * (pay - 10000) : 0;

	}
	//now bonus method for those which are not SalesPerson
	public static double bonus(Employee emp){
		if(emp instanceof SalesPerson)
			return 0;
		return 0.12 * emp.payment();

	}



	//main method
	public static void main(String[] args){
	//creating object of Employee class ->jack
	Employee jack  = new Employee();
	jack.setHours(250);
	jack.setRate(60);

	SalesPerson jill = new SalesPerson(250,60,25000); //obj of SalesPerson class
	//jill.setSales(00);
	System.out.printf("Payment and tax of jack is %.2f and %.2f %n", jack.payment(), tax(jack));

	System.out.printf("Payment and tax of jill is %.2f and %.2f %n", jill.payment(), tax(jill));

	System.out.printf("Payment , tax and bonus of jill is %.2f and %.2f %.2f %n", jill.payment(), tax(jill),bonus(jill));

	System.out.println("Number of Employees = " + Employee.countInstances());

	}


}














