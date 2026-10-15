import java.util.*;

class Student 
{
	private String sname;
	private int sid;
	private int marks[] = new int[5];
	private long phNo;
	
	Student(String sname, int sid, int[] marks, long phNo)
	{
		this.sname = sname;
		this.sid = sid;
		this.phNo = phNo;
		
		for(int i=0; i<marks.length; i++)
		{
			this.marks[i] = marks[i];
		}
	}
	
	public String getSname()
	{
		return sname;
	}
	
	public int getSid()
	{
		return sid;
	}
	
	public long getPhNo()
	{
		return phNo;
	}
	
	// method to calculate average
	public double getAverage()
	{
		int sum = 0;
		for(int i=0; i<marks.length; i++)
		{
			sum += marks[i];
		}
		return sum / 5.0;
	}
}

class StudentTask
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int option;
		Student s1 = null;
		
		do
		{
			System.out.println("1.Create Account \n2.Display Avg \n3.Exit");
			System.out.print("Enter your option: ");
			option = sc.nextInt();
			
			switch(option)
			{
				case 1:
					System.out.print("Enter your name: ");
					String name = sc.next();
					
					System.out.print("Enter your id: ");
					int id = sc.nextInt();
					
					System.out.print("Enter your phone number: ");
					long phNo = sc.nextLong();
					
					int marks[] = new int[5];
					System.out.print("Enter your marks: ");
				
					for(int i=0; i<marks.length; i++)
					{
						marks[i] = sc.nextInt();
					}
					
					s1 = new Student(name, id, marks, phNo);
					break;
				
				case 2:
					if(s1 != null)
						System.out.println("Average = " + s1.getAverage());
					else
						System.out.println("Create account first!");
					break;
				
				case 3:
					System.out.println("Thank You");
					break;
			}
		}while(option != 3);
	}
}