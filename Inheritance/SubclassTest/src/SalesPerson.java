

package payroll;
//SalesPerson is subclass of Employee (Superclass)
public class SalesPerson extends Employee{
	//instance variable
	private double sales;

	//constructor
	public SalesPerson(int hours, float rate,double sales){
		super(hours,rate); 		//first calling constructor of super class and passing values into it and also initial							//-izing sales value
		this.sales = sales;
	}
	/*
	public SalesPerson(){

	}
	*/

	//now setter and getter for fields
	public double getSales(){
		return sales;
	}
	public void setSales(double sales){
		this.sales = sales;
	}
	//now here comes the main part where we goona override the payment method  whihc is defined inside superclass
	//java implicitely supports dynamic binding to all functions defined inside super classs
	//so no need to declare virtual to super class funciton all are by default support dynamic binding
	//no we want to give our own logic/implementation for SalesPerson type payment method
	//condition -> those salesperson who sold product worth more than or equalto 20000 Rs are eligible for extra commision  
	//condition -> the commision will be 5 % of total sales
	//basic payment condition will be same for all employees which is defined inside super class
	public double payment(){
		double pay = super.payment();	//calling super class payment method through super keyword
		if(sales >= 20000)		//business logic
			pay += 0.05 * sales;			
		return pay;
	}



}







