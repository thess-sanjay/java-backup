interface Bird
{
	void fly();
}

interface Fish
{
	void swim();
}

class Animal
{
	void run()
	{
		System.out.println("Animals can Run");
	}
}


class SuperHero extends Animal implements Bird,Fish
{
	@Override
		public void fly()
	{
		System.out.println("Birds can fly");
	}
	
	@Override
		public void swim()
	{
		System.out.println("Fish can swim");
	}
}

class MultipleInheritance2
{
	public static void main(String[] args) 
	{
		SuperHero ob = new SuperHero();
		ob.fly();
		ob.swim();
		ob.run();
	}
}
