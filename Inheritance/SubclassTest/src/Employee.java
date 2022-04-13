package payroll;
//now purpose of these class is to define employee hours, rate, and their respective salary calculation based on their variables;
//
public class Employee {
//instance variables
private int hours;
private float rate;
private static int count;       //static variable for class work purpose
//value of static variable is shared by all instances means static variable gets created at the time of class loading and remains there throughout program execution and its value is same for all objects

//parameterised constructor
public Employee(int hours, float rate){
this.hours = hours;
this.rate  = rate;
++count;
                                                                                                                                      }
//parameterless constructor
public Employee(){
        this(0,50);     //calling another constructor of 'this' class
}

//now field accessor methods also known as setters and getters for each individual variable
//setter for hours
public void setHours(int hours){
this.hours = hours;
}
//getter for hours
public int getHours(){
return hours;
}
//setter for rate
public void setRate(float rate){

this.rate = rate;
}
//getter for rate
public float getRate(){
return rate;
}

//now our bussiness logic to calculate payment for employee based on his/her hours
public double payment(){                                                                                                                      double pay = rate * hours;
                if(hours>180){
                int ot  = hours - 180;
                double otPay = ot * 50;
                pay += otPay;
                                }
        return pay;
}
//now we want to know how many objects of these class we have created throughout program execution
//so we define a method to return count value
//now notice that we goona use static method which will be called on its class because its deals with s static variales of class
public static int countInstances(){
        return count;
}

}                                                     

