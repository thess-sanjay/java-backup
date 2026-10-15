import java.util.*;

class Ride
{
	String pickup;
	String drop;
	int distance;
	
	Ride(String pickup, String drop, int distance)
	{
		this.pickup = pickup;
		this.drop = drop;
		this.distance = distance;
	}
	
	void RideDetails()
	{
		System.out.println("Pickup is: " + pickup);
		System.out.println("Drop is: " + drop);
		System.out.println("Total Distance is: " + distance);
	}
}

class Auto extends Ride
{
	String driverName = null;
	int price = 25;
	Auto(String pickup, String drop, int distance)
	{
		super(pickup, drop, distance);
		
	}
	
	void autoDetails()
	{
		System.out.println("Driver Name is: " + driverName);
		System.out.println("Total ride cost: " + (price * distance));
	}
}

class Bike extends Ride
{
	String driverName = null;
	int price = 13;
	
	Bike(String pickup, String drop, int distance)
	{
		super(pickup, drop, distance);
		
	}
	
	void bikeDetails()
	{
		System.out.println("Driver name is: " + driverName);
		System.out.println("Total ride cost: " + (price * distance));
	}
}

class Car extends Ride
{
	String driverName = null;
	int price = 50;
	
	Car(String pickup, String drop, int distance)
	{
		super(pickup, drop, distance);
	
	}
	
	void carDetails()
	{
		System.out.println("Driver name is: " + driverName);
		System.out.println("Total ride cost: " + (price * distance));
	}
}

class Uber 
{
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("1.Auto \n2.Bike \n3.Car");
		
		System.out.print("Enter Anyone option: ");
		int option = scan.nextInt();
		
		Ride r = null;
		
		switch(option)
		{
			case 1 : r = new Auto("Arumbakkam", "Vadapalani", 2);
					 break;
					 
			case 2 : r = new Bike("Arumbakkam", "Ashok Nagar", 5);
					 break;
					 
			case 3 : r = new Car("Vadapalani", "WTC,Perungudi", 15);
					 break;
					 
			default : System.out.println("Enter the Correct Option");
		}
		r.RideDetails();
		
		if(r instanceof Auto)
		{
			Auto a = (Auto) r;
			a.autoDetails();
		}
		else if(r instanceof Bike)
		{
			Bike b = (Bike) r;
			b.bikeDetails();
		}
		else if(r instanceof Car)
		{
			Car c = (Car) r;
			c.carDetails();
		}
	}
}
