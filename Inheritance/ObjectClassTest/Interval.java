

class Interval {
//instance variable
private int min;
private int sec;

//constructor which accepts min and sec values
public Interval(int min, int sec){
	this.min = min + sec / 60;	//we are converting extra seconds into minutes and adding them into min of object instance
	this.sec = sec%60;		//here we aare chopping extra seconds and only getting seconds if it is in 60 sec limit;

}
//getters
public int getMin(){
return min;
}
public int getSec(){
return sec;
}
//notice that we only wrote getters not setters because we dont want user to change values of the fields once it got creaetd 
//so these class is immutable class ->means it can not be changed once you create object of it

//now in below function we goona return total time in seconds
public int time(){
return min * 60 + sec;
}

//now we goona override toString() method according to our own needs or impelemtations
//but toString() method is coming from java.lang.Object and this is root of all classes directly/indirectly that means at anytime you can call these methods through your object
public String toString(){
	if(sec < 10)
		return min + ":0" + sec;
	return min + ":" + sec;
}

//overrinding hashCode() method from java.lang.Object
//

public int hashCode(){
	return min + sec;
}


//overriding equals method of java.lang.Object to return whether 
//the state of this object matches with that of other objects
public boolean equals(Object other){
	if(other instanceof Interval){
	Interval that = (Interval)other;	//explicit downcasting
	return (this.min == that.min) && (this.sec == that.sec);
	}
	return false;

}








}





