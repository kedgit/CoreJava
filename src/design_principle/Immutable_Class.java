package design_principle;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


final class Check{
	
	private int id;
	private List<String> names;
	
	Check(int id,List<String> names){
		this.id=id;
		// provide deep copy of list instead direct list to prevent mutability of list outside scope impact on class
		this.names=new ArrayList<>(names);
	}

	void print() {
		System.out.println(names); 
	}
}

public class Immutable_Class {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("bulbul");
		
		Check s= new Check(1,list);
		
		list.add("niga");
		
		s.print();
		
	}

}
