package Solid_Principles;

// high level model does not depend on low level model
// depends on middleware means abstraction
// ex . high level model - computer
//      low level model - keyboard, touchscreen 
// dont bind directly keyboard or touchscreen with computer 
// use interface in middle for loose coupling


// BAD Approach
// first input device
class KeyBoard{	
	void type() {
		System.out.println("Input From KeyBoard !");
	}
}

// second input device

class TouchScreen{	
	void type() {
		System.out.println("Input From TouchScreen !");
	}
}

class Computer { 
	// direct dependency
	private KeyBoard kb=new  KeyBoard();
	void input1() {
		kb.type();
	}
	
	private TouchScreen ts=new TouchScreen();
	void input2() {
		ts.type();
	}
}

// Good Approach
interface InputDevice{
	void type();
}

class KeyBoard1 implements InputDevice{

	@Override
	public void type() {
		System.out.println("Input From KeyBoard1 !");
	}
	
}

class TouchScreen1 implements InputDevice{

	@Override
	public void type() {
		System.out.println("Input From TouchScreen1 !");	
	}
	
}

class Computer1{
	private InputDevice inputdevice;
	
	Computer1(InputDevice inputdevice){
		this.inputdevice=inputdevice;
	}
	
	void input() {
		inputdevice.type();
	}
}

public class Dependency_Inversion {

	public static void main(String[] args) {
	
//		Computer pc =new Computer();
//		pc.input1();
//		pc.input2();
		
		InputDevice keyboard=new KeyBoard1();
		InputDevice touch=new TouchScreen1();
		
		Computer1 pc = new Computer1(keyboard);
		pc.input();
		
		Computer1 tab=new Computer1(touch);
		tab.input();
		

	}

}
