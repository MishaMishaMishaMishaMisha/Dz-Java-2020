package dz_OOP_4_23;

public class Teeth
{
	private int count; // кількість зубів
	
	public Teeth()
	{
		count = 0;
	}
	
	public Teeth(int count)
	{
		this.count = count;
	}
	
	public void setCount(int count)
	{
		this.count = count;
	}
	
	public int getCount()
	{
		return this.count;
	}
}