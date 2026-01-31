package oops;


class Account_Details{
	
	// wrap data and method to restric accees and visible by getter and setter
	// make private access inside class only but public method to make visisble
	private long acc_number=781394299080L;
	private String name="Kedar";
	private double balance=24503.25d;
	private long mob_number;
	
	// only get restricated to set
	public void get_acc_number() {
		System.out.println("youe account number is: "+ acc_number);
	}
	
	// only get restricated to set
	public void get_name() {
		System.out.println("your name is: "+ name);
		
	}

	
	// only get restricated to set
	public void getbalance() {
		System.out.println("your acc balance is: "+balance);
	}


	public void setMob_number(long mob_number) {
		this.mob_number = mob_number;
	}
	
	public long getMob_number() {
		return mob_number;
	}
	
}

public class Encaptulation {

	public static void main(String[] args) {
		Account_Details user=new Account_Details();
		user.get_acc_number();
		user.get_name();
		user.setMob_number(9049537222L);
		System.out.println("Your mobile number is: " + user.getMob_number()); 
		
		user.getbalance();
	}

}
