package dz_OOP_4_23;

public class Claws
{
	private int length; // довжина кігтів
	
	public Claws()
	{
		length = 0;
	}
	
	public Claws(int length)
	{
		this.length = length;
	}
	
	public void setLength(int length)
	{
		this.length = length;
	}
	
	public int getLength()
	{
		return this.length;
	}
}