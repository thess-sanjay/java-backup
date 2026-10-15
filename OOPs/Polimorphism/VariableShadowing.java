class A
{
	int x = 10;
}

class B extends A
{
	int x = 20;
}


class VariableShadowing 
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		
		System.out.println(b1.x);
	}
}
