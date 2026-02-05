package design_principle;

// for Single pattere with safty
// 1. class make final 
// 2. constructor must be private
// 3. synchronized for multiple thread access same class

class OneObject{
	private static OneObject oneobject;
	
	public static OneObject getInstance() {
		
		if(oneobject==null) {
			oneobject=new OneObject();
			System.out.println("first time object created");
			return oneobject;
		}
		System.out.println("alredy object created ! Just Use.");
		return oneobject;
	}
	void show() {
		System.out.println("Hey User !");
	}
}

// 2. double check with class synchronization
class OneObject1{
	private static OneObject1 oneobject;
	
	public static OneObject1 getInstance() {
		
		if(oneobject==null) {
			
			synchronized(OneObject1.class){
				if(oneobject==null) {
					new OneObject1();
				}
			}
		}
		
		return oneobject;
	}
	void show() {
		System.out.println("Hey User !");
	}
}

// 3.thread safty
class OneObject2{
	// constructor
	private OneObject2() {};
	
	// inner class 
	private static class Inner{
		private static final OneObject2 instance=new OneObject2();
	}
	public static OneObject2 getInstance(){
		return Inner.instance;
	}
	void object() {
		System.out.println("i am object");
	}
}

// just use instance alreadt create by its inner class

public class Singletone1 {

	public static void main(String[] args) {
		
		
		// before object create check for confirmation
		// oneObject.show();
		// create object
//		OneObject.getInstance();
//		
//		// use object if created or create 
//		OneObject one=OneObject.getInstance();
//		one.show();
//		
		OneObject2 one=OneObject2.getInstance();
		one.object();
		
		
	}

}
