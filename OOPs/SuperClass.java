class Payment
{
	double amount;
	String storeName;
	
	Payment(double amount, String storeName)
	{
		this.amount = amount;
		this.storeName = storeName;
	}
	
	void paymentDetails()
	{
		System.out.println("Store Name: " + storeName);
		System.out.println("Amount paid: " + amount);
	}
}
class DebitCard extends Payment
{
	DebitCard(double amount, String storeName)
	{
		super(amount, storeName);
	}
}
class Cash extends Payment
{
	Cash(double amount, String storeName)
	{
		super(amount, storeName);
		System.out.println("Payment done by Cash");
	}
}



class SuperClass
{
	public static void main(String[] args) 
	{
		Cash c1 = new Cash(4000, "Emma store");
		
		c1.paymentDetails();
		
		DebitCard d1 = new DebitCard(8000, "Nexus");
		d1.paymentDetails();
	}
}
