package Solid_Principles;

// Single class has multiple jobs
// single method error reflect on other methods 
// if change in one method is stop whole application
// finding bugs is hard
// code understanding is difficult
// heavy load on class
// tight coupling

// Bad
class Devlopment{
	
	void devlop() {
		System.out.println("Developing Appilication");
	}
	
	void test() {
		System.out.println("Testing Application");
	}
	
	void deploy() {
		System.out.println("Deploying Application By");
	}
}

// insted use SRP
// change in one class not affect on deifferent class
// extend is easy by adding new class
// easy to understad 
// team work on different features 
// finding bugs easily
// independent class is good for heay models
// loose coupling


// Good
// SRP improves development time, not execution time
class Developer{
	
	void devlope() {
		System.out.println("Developing Appilication");
	}
}

class Tester{
	
	void test() {
		System.out.println("Testing Application");
	}
}

class Deployment{
	
	void deploy() {
		System.out.println("Deploying Application");
	}
}

public class Single_Responciable {

	public static void main(String[] args) {
		
		Devlopment all=new Devlopment();
		
		Developer c=new Developer();
		Tester t=new Tester();
		Deployment d=new Deployment();
		
		all.deploy();
		d.deploy();
	}

}
