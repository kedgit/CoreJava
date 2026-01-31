package oops;

class shop{
	void drink() {
		System.out.println("drink from shop");
	}
}

class station extends shop{
	void drink() {
		System.out.println("drink from station");
	}
	
}

public class Polymorphism {

	public static void main(String[] args) {
		
		shop s;
		s=new station();
		s.drink();

	}

}
