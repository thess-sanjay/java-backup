class Parent
{
	static int x = 30;
	static void dancing()
	{
		System.out.println("Parents are dancing");
	}
}

class Child extends Parent
{
	static int x = 20;
	static void dancing()
	{
		System.out.println("Child is dancing");
	}
}


class MethodShadowing
{
	public static void main(String[] args) 
	{
		Child c = new Child();
		c.dancing();
		System.out.println(c.x);
		
		Parent p = new Parent();
		p.dancing();
		System.out.println(p.x);
		
		Parent p1 = new Child();
		p1.dancing();
	}
}
