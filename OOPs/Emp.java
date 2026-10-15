class Emp 
{
	private String ename;
	private int eid;
	
	Emp(String ename)
	{
		this.ename = ename;
	}
	Emp(int eid)
	{
		this.eid = eid;
	}
	
	public String getEname()
	{
		return ename;
	}
	
	public void setEname(String ename)
	{
		this.ename = ename;
	}
	
	public int getEid()
	{
		return eid;
	}
	public void setEid(int eid)
	{
		this.eid = eid;
	}
}
