interface Father
{
	void car();
}

class Mother
{
	void care()
	{
		System.out.println("Taking care of the family");
	}
}

interface Grandpa
{
	void storyTelling();
}

class Child extends Mother implements Father, Grandpa
{
	@Override
	public void car()
	{
		System.out.println("Free Car ride");
	}
	
	@Override
		public void storyTelling()
	{
		System.out.println("He knows Marvel Stories");
	}
}

class MultipleInheritance 
{
	public static void main(String[] args) 
	{
		Child ob = new Child();
		ob.car();
		ob.care();
		ob.storyTelling(); 
	}
}
