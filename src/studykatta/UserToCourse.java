package studykatta;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;
import java.util.HashSet;


class User{
	
	int userId;
	String name;
	String role;
	LocalDate date;
	Set<Enrollment> enrollments;
	
	User(int userId, String name, String role, LocalDate date) {
		this.userId = userId;
		this.name = name;
		this.role = role;
		this.date = date;
		this.enrollments=new HashSet<>();
	}
	
	void addEnrollment(Enrollment enrollment) {
		enrollments.add(enrollment);
		
	}
	
	void showCourse() {
		for(Enrollment en:enrollments) {
			System.out.println(en.course.courseId+" "+en.course.name+" "+en.date);
		}
	}
	
}

class Course{
	int courseId;
	String name;
	Set<Enrollment> enrollments;
	Course(int courseId, String name) {
		this.courseId = courseId;
		this.name = name;
		this.enrollments=new HashSet<>();
	}
	
	void addEnrollment(Enrollment enrollment) {
		
		enrollments.add( enrollment);
		
	}
	void showUsersCourse() {
		for(Enrollment en:enrollments) {
			System.out.println("Userid:"+en.user.userId+" Username:"+en.user.name+" Date"+en.user.date);
		}
	}
}


class Enrollment{
	
	User user;
	Course course;
	LocalDate date;
	
	public Enrollment(User u1, Course c1, LocalDate now) {
		this.user=u1;
		this.course=c1;
		this.date=now;
		
		u1.addEnrollment(this);
		c1.addEnrollment(this);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(user.userId,course.courseId);
	}
	
	@Override
	public boolean equals(Object o) {
		if(this==o) return true;
		if(!(o instanceof Enrollment)) return false;
		
		Enrollment that=(Enrollment) o;
		return user.userId==that.user.userId && course.courseId==that.course.courseId;
	}
}

public class UserToCourse {

	public static void main(String[] args) {
		
		User kedar=new User(101,"Kedar","Student",LocalDate.parse("2026-02-02"));
		User rohit=new User(102,"Rohit","Student",LocalDate.parse("2026-02-01"));
		
		Course java=new Course(1,"Java");
		Course react=new Course(2,"React");
		
		
		new Enrollment(kedar,java,LocalDate.now());
		new Enrollment(kedar,react,LocalDate.parse("2026-02-11"));
		new Enrollment(rohit,react,LocalDate.now());
		new Enrollment(kedar,react,LocalDate.now());
		
		kedar.showCourse();
//		react.showUsersCourse();

	}

}
