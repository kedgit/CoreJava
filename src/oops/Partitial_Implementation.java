package oops;



interface bank{
	void refund();
	void pay();
}

//power of abstract class { some method not implemnnted }

abstract class onlinepayement implements bank{

	// each class has same logic of refund method
	// when require the use
	@Override
	public void refund() {
		// TODO Auto-generated method stub
		
	}
	
}

class phonepay extends onlinepayement{

	@Override
	public void pay() {
		
		System.out.println("phone pay");
		
	}
	
	public void refund() {
		System.out.println("refund by phonepay");
	}
	
}

class googlepay extends onlinepayement{

	@Override
	public void pay() {
		
		System.out.println("google pay");
		
	}
	
}

public class Partitial_Implementation {
	public static void main(String args[]) {
		
	onlinepayement o=new phonepay();
	
	o.refund();
	o.pay();
	
	onlinepayement g=new googlepay();
	
	g.refund();
	g.pay();
	}
	
}
