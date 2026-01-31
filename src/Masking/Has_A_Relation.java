package Masking;

class Engine{
	public void start() {
		System.out.println("engine started !");
	}
}

class car{
	// car has a engine
	Engine eng;  
	
	// constructor injection
	car(Engine eng){
		this.eng=eng;
		
	}
	public void move() {
		eng.start();
		System.out.println("car is moving !");
	}
}


public class Has_A_Relation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// engine propert store in var e
		Engine e=new Engine();
		
		// pass engine props to car through var e
		car c= new car(e);
		c.move();
	}

}
