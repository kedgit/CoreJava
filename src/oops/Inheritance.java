package oops;

// super class
class Animal{
	String name;
	int age;
}

class cat extends Animal{
	void sound() {
		System.out.println("mau mau");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal c=new cat();
		c.name="jira";
		System.out.println(c.name);
		
	}
}
