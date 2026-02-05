package Masking;

// it is a relation between two class i.e when one class has contains object of another class h
// as a field and reuse it.
// code reuse , clean and flexible or loose coupling
// one to one relation

class Address {
    String city;
    String street;
}

class Student {

    Address address;

    Student(Address address) {
        this.address = address;
    }

    void showAddress() {
        System.out.println("Student City: " + address.city);
        System.out.println("Student Street: " + address.street);
    }
}

class Teacher{
	Address address;
	Teacher(Address address) {
        this.address = address;
    }

    void showAddress() {
        System.out.println("Teacher City: " + address.city);
        System.out.println("Teacher Street: " + address.street);
    }
	
}

public class Has_a_Relation2 {

    public static void main(String[] args) {

        Address add = new Address();
        add.city = "Solapur";
        add.street = "Satrasta";

        Student std = new Student(add);
        std.showAddress();
        
        Address teacherAdd = new Address();
        teacherAdd.city = "Pune";
        teacherAdd.street = "MG Road";
        
        Teacher tec = new Teacher(teacherAdd);
        tec.showAddress();
        
    }
}
