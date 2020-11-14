package dz_OOP_7_8;

public class Tanker implements Ship
{
	protected String name;
	protected float weight;
	
	public Tanker(String name, float weight)
	{
		this.name = name;
		this.weight = weight;
	}
	
	public void sail()
	{
		System.out.println("Танкер відпливає");
	}
	
	public void arrive()
	{
		System.out.println("Танкер прибув у місце призначення");
	}
	
	@Override
	public String toString()
	{
		return "Танкер " + name + " перевозить вантаж вагою " + weight;
	}
}