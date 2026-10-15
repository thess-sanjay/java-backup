class Rapido
{
	String pickup;
	String decision;
	int distance;
	
	Rapido(String pickup, String destination, int distance)
	{
		this.pickup = pickup;
		this.destination = destination;
		this.distance = distance;
	}
}
class Bike extends Rapido
{
	int bikePrice = 10;
	
	Bike(String pickup, String destination, int distance)
	{
		super(pickup, destination, distance);
	}
		
}
class Auto
{
}


class User
{
	public static void main(String[] args) 
	{
		Bike b1 = new Bike("Arumbakka", "Vadapalani", 20);
		
	}	
}
