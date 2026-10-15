class Dept
{
	public static void main(String[] args) 
	{
		Emp e1 = new Emp("Dhoni");
		
		
		// System.out.println(e1.ename);
		// e1.ename = "Jaddu";
		// System.out.println(e1.ename);
		
				
			System.out.println(e1.getEname());
			
			e1.setEname("Jaddu");
			System.out.println(e1.getEname());
			
			e1.setEid(2096);
			System.out.println(e1.getEid());
	}
}
