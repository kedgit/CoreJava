package Solid_Principles;

// Lisko_Substitution
// parent promise
// Objects of a superclass should be replaceable with objects of 
// its subclasses without affecting the correctness of the program.
interface Animal{
	
	void run();
}

interface Jump extends Animal{
	
	void jump();
}

class Horse implements Jump{

	@Override
	public void jump() {
		System.out.println("Horse Can Jump");
	}

	@Override
	public void run() {
		System.out.println("Horse Can Run");
		
	}
	
}
class Rat implements Animal{

	@Override
	public void run() {
		System.out.println("Rat Can Run");
		
	}
	
	
	
}
public class Lisko_Sustuitution {

	public static void main(String[] args) {
		
		Animal h1=new Horse();
		h1.run();
		
		Jump h=new Horse();
		h.jump();
		
		Animal r1=new Rat();
		r1.run();
		
		
		
		
		
		

	}

}
