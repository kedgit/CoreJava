package enumclass;

enum Status {
	
	 ASSIGN, COMPLETE, PENDING, IN_PROGRESS, CLOSED;
}

public class User {
	
	private Status status;
	
	User(Status status){
		
		this.status=status;
		
	}
	public void printStatus() {
		System.out.println("User Status: " + status);
	}
	
	
	public static void main(String args[]) {
		
	User user=new User(Status.CLOSED);
	
	user.printStatus();
	
	if(user.status!=null) {
		System.out.println("Ticket: " + user.status);
	}
	
	}
}