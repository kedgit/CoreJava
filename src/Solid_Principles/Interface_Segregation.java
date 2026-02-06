package Solid_Principles;

// Interface Segregation Principle
// Clients should not be forced to depend on methods they do not use.”
// In other words, create small, specific interfaces rather than a large general-purpose interface.


// BAD Approach

interface Activity{
	void Running();
	void Swimming();
	void Jumping();
	
}

class Ratq implements Activity{

	@Override
	public void Running() {
		// TODO Auto-generated method stub
		
	}

	@Override
	// bad coding
	public void Swimming() {
		throw new RuntimeException("Rat Can't Swim ");
		
	}

	@Override
	public void Jumping() {
		
		throw new RuntimeException("Rat Can't Jump ");
	}
	
}

// GOOD Approach

interface Swimming {
	void Swim();
}

interface Running{
	void Run();
}

interface Jumping{
	void Jump();
}

class Rat1 implements Running{
	public void Run() {
		System.out.println("Rat Can Run !");
	}
}

class Horse1 implements Running,Jumping{

	@Override
	public void Jump() {
		System.out.println("Horse Can Jump");
	}

	@Override
	public void Run() {
		System.out.println("Horse Can Run");
	}
	
}

class Frog implements Running,Jumping,Swimming{

	@Override
	public void Swim() {
		System.out.println("Frog Can Swim");
		
	}

	@Override
	public void Jump() {
		System.out.println("Frog Can Jump");
		
	}

	@Override
	public void Run() {
		System.out.println("Frog Can Run");
		
	}
	
}
public class Interface_Segregation {

	public static void main(String[] args) {
		
		Swimming fs=new Frog();
		fs.Swim();
		
		Running fr =new Frog();
		fr.Run();
		
		Running rr=new Rat1();
		rr.Run();
		
		Running hr=new Horse1();
		hr.Run();
		
		Jumping fj=new Frog();
		fj.Jump();
	}

}
