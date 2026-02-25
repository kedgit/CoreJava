package design_principle;

// LoD Rules
// 1.only talks itself 
// 2. its field
// 3. its methods
// 4 object its creates
// don't talk to friend of friend

// without LoD
// deep chaining 
// tight coupling
// many changes

class Address{
	private  String city="mumbai";
	public String getCity(){
		return city;
	}
}

// 1.change by Location
class Location {
	private String city="delhi";
	public String getCity() {
		return city;
	}
}

// 2.second change in customer

class Customer{
	// private Address address;
	private Location location;
	Customer(){
		// this.address=new Address();
		this.location=new Location();
	}
	
//	public Address getAddress() {
//		return address;
//		
//	}
	
	public Location getLocation() {
		return location;
	}
	
}


class Order {
	private Customer customer;
	
	Order(){
		this.customer=new Customer();	
	}
	public Customer getCustomer() {
		return customer;
		
	}
}

// with LoD --> law of demeter

class Address1{
	private String city="Pune";
	public String getCity() {
		return city;
	}
	
}

// 1.change address to location
class Location1 {
	private String city="delhi";
	public String getCity() {
		return city;
	}
}

// 2.change object
class Customer1{
	
	// private Address1 address=new Address1();
	 Location1 location1=new Location1();
	public String getCity() {
		return location1.getCity();
	}
}

class Order1 {
	private Customer1 customer1=new Customer1();
	
	public String getCity() {
		return customer1.getCity();
	}
}

// after some days want change address to lacation they update all class if not use LoD
// with lod minimal changes
public class Law_Of_Demeter {

	public static void main(String[] args) {
		// no use LoD 
//		Order o=new Order();
//	    // 3. third change in this line also
//		String city=o.getCustomer().getLocation().getCity();
//		System.out.println(city);
		
		Order1 o1=new Order1();
		String city1=o1.getCity();
		System.out.println(city1);

	}

}
