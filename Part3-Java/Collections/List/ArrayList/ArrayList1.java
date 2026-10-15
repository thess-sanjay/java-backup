import java.util.*;

class ArrayList1 
{
	public static void main(String[] args) 
	{
		ArrayList<Object> al = new ArrayList<Object>();
		
		al.add(1);
		al.add("Sanjay Saravanan");
		al.add('A');
		al.add(true);
		al.add(null);
		al.add(1);
		al.add(null);
		al.add(1234567890l);
		
		
		System.out.println(al);
		System.out.println(al.contains('A'));
	}
}
