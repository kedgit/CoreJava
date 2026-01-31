package oops;

interface RBI{
	void rate();
}

class BOI implements RBI{

	@Override
	public void rate() {
		System.out.println("BOI: 7 % rate");
	}
	
}

class SBI implements RBI{

	@Override
	public void rate() {
		
		System.out.println("SBI: 8.5 % rate");
	}
	
}

class HDFC implements RBI{

	@Override
	public void rate() {
		
		System.out.println("SBI: 10 % rate");
		
	}
	
}

class RATE {
	
	RBI rbi;
	RATE(RBI rbi){
		this.rbi=rbi;
	}
	
	 void showRate() {
	        rbi.rate();
	    }
}

public class MultipleInheritance {

	public static void main(String[] args) {
		
		RATE r=new RATE(new SBI());
		RATE b=new RATE(new BOI());
		RATE h=new RATE(new HDFC());
		
		r.showRate();
		b.showRate();
		h.showRate();
	}

}
