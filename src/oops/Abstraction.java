package oops;

// partialy abstraction due to some implemented methods in abstract class
// instance and static variable
abstract class Car{
	 int a=10;
	abstract void fueltype();
	abstract void start();
	void stop() {
		System.out.println("Stop the Car ");
	}
}

// 100 % abstraction by interface before java 8 no concreate method means body method
//  but after java8 there is default and static method
// only constant variable they bydefault public static final

interface Car2 {
	String name="Skoda";
	void run();
}

class tata extends Car implements Car2{
	
	@Override
	void fueltype() {
		
		System.out.println(tata.name+" Car run on Diesel and price is: "+a);
		
	}
	
	void start() {
		System.out.println("Car is Started ");
	}

	@Override
	public void run() {
		System.out.println(tata.name+" is Running");
		System.out.println(a);
	}
	
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tata t=new tata();
		t.fueltype();
		t.start();
		t.stop();
		t.run();
		//System.out.println();
	}

}
