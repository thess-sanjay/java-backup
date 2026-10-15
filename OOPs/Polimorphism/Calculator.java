// Polymorphism --> Same method name but different formal arguments..

class Calculator 
{
	void add()
	{
		System.out.println(10+50);
	}
	
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	void add(float a, float b)
	{
		System.out.println(a+b);
	}
	
	void add(int a, int c, double b)
	{
		System.out.println(a+b);
	}
	
	void add(float a, double b)
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) 
	{
		Calculator c1 = new Calculator();
		c1.add();
		c1.add(100, 200);
		c1.add(50.25f, 50.25f);
		c1.add(30, 30, 20.1);
		c1.add(10.20f, 10.1);
	}
}
