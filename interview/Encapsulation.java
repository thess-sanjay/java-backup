class student{
	private int marks;
	
	int getMarks()
	{
		return marks;
	}
	void setMarks(int m)
	{
		marks = m;
	}
}

public class Encapsulation
{
	public static void main(String[] args)
	{
		student s1 = new student();
		
		s1.setMarks(40);
		System.out.println(s1.getMarks());
	}
}