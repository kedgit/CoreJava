package Solid_Principles;

// OpenClosedPrinciple -> Open for extension, closed for modification
// is nothing but , stay old and add new with new version
// old stable and add code/feature for new version 
// dont modify old version for new feature adding 
// loose coupling
// extendable

// BAD Approch
// old code 
// if new usertype comes then we want changes in old code which effect other logic
class DiscountForUser{
	
	double CalculateDiscount(String usertype,double price) {
		
		if(usertype.equals("regular"))
			return 0.90 * price;
		
		if((usertype.equals("Premium")))
			return 0.80 * price;
		
		return price;
	}
}

// GOOD Approach
// instead use O/C Principle

interface Discount{
	double apply (double price);
}

class RegularDiscount implements Discount{

	@Override
	public double apply(double price) {	
		return 0.70 * price;
	}
}

class PremiumDiscount implements Discount{

	@Override
	public double apply(double price) {
		return 0.80 * price;
	}
}

class VipDiscount implements Discount{

	@Override
	public double apply(double price) {
		return 0.90 * price;
	}
}

class DiscountForCustomer{
	
	double calculate(Discount discount, double price) {
        return discount.apply(price);
    }
}

public class Open_Closed {

	public static void main(String[] args) {
		DiscountForUser user=new DiscountForUser();
		double d = user.CalculateDiscount("Premium", 50);
		System.out.println(d);
		
		DiscountForCustomer calculator=new DiscountForCustomer();
		

        Discount regular = new RegularDiscount();
        Discount premium = new PremiumDiscount();
        Discount vip = new VipDiscount();

        System.out.println("Discount for Regular Customer: " + calculator.calculate(regular, 1000));
        System.out.println("Discount for Premium Customer: " + calculator.calculate(premium, 1000));
        System.out.println("Discount for VIP Customer: " + calculator.calculate(vip, 1000));
		

	}

}
