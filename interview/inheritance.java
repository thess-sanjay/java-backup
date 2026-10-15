class one
{
	int money = 2000;
}
class two extends one
{
}
public class inheritance
{
	public static void main(String[] args)
	{
		two m1 = new two();
		System.out.println(m1.money);
	}
}