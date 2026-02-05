package Masking;


import java.util.HashSet;
import java.util.Set;

// one to manty relation

class Course{
	String name;
	Course(String name){
		this.name=name;
	}
	
	@Override
    public String toString() {
        return name;  // now printing the object prints its name
    }
}

class Students{
	String name;
	Set<Course> courses;
	Students(String name){
		this.name=name;
		this.courses=new HashSet<>();
	}
	void addCourse(Course course) {
		courses.add(course);
	}
	void showMyCourse() {
		for(Course c:courses) {
			System.out.println(c);
		}
	}
}


public class Has_a_relation3 {

	public static void main(String[] args) {
	
		Course java=new Course("Java");
		Course js=new Course("JavaScript");
		Course react=new Course("React");
		Course py=new Course("Python");
		
		
		Students kedar=new Students("Kedar");
		kedar.addCourse(java);
		kedar.addCourse(py);
		kedar.addCourse(js);
		
		kedar.showMyCourse();
		
		Students raj=new Students("Raj");
		raj.addCourse(react);
		raj.addCourse(js);
		raj.addCourse(react);
		
		raj.showMyCourse();
	}

}
