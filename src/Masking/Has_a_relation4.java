package Masking;

import java.util.ArrayList;
import java.util.List;


// many to many relation

class Bank{
	String name;
	List<User> users;
	
	Bank(String name){
		this.name=name;
		this.users=new ArrayList<>();
		
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	void addUsers(User user) {
		users.add(user);
	}
	
	void showAllUsers() {
		System.out.println(name+" Bank Account Holders are: ");
		for(User u:users) {
			System.out.println(u);
		}
	}
}

class User{
	
	String name;
	List<Bank> banks;
	
	User(String name){
		this.name=name;
		this.banks=new ArrayList<>();
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	void addbank(Bank bank) {
		banks.add(bank);
	}
	
	void showMyAllBanks() {
		System.out.println(name+"s Account in: ");
		for(Bank b:banks) {
			System.out.println(b);
		}
	}
}


public class Has_a_relation4 {

	public static void main(String[] args) {
		
		Bank sbi=new Bank("SBI");
		Bank boi=new Bank("BOI");
		Bank icici=new Bank("ICICI");
		
		
		User msd=new User("Dhoni");
		User virat=new User("Kohali");
		User rohit=new User("Rohit");
		
		sbi.addUsers(msd);
		sbi.addUsers(rohit);
		boi.addUsers(virat);
		icici.addUsers(rohit);
		boi.addUsers(msd);
		
		msd.addbank(boi);
		msd.addbank(sbi);
		msd.addbank(boi);
		rohit.addbank(icici);
		rohit.addbank(sbi);
		virat.addbank(boi);
		
		
		
		msd.showMyAllBanks();
		rohit.showMyAllBanks();
		boi.showAllUsers();
		
	}

}
