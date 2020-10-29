package dz_OOP_5_2;

public class Sweets
{
	private int weight;
	private int amountOfSugar;
	private String name;
	
	public Sweets()
	{
		weight = 0;
		amountOfSugar = 0;
		name = "";
	}
	
	public Sweets(int weight, int amountOfSugar, String name)
	{
		this.weight = weight;
		this.amountOfSugar = amountOfSugar;
		this.name = name;
	}
	
	protected void setName(String name)
	{
		this.name = name;
	}
	
	protected String getName()
	{
		return this.name;
	}
	
	protected void setWeight(int weight)
	{
		this.weight = weight;
	}
	
	protected int getWeight()
	{
		return this.weight;
	}
	
	protected void setAmountOfSugar(int amountOfSugar)
	{
		this.amountOfSugar = amountOfSugar;
	}
	
	protected int getAmountOfSugar()
	{
		return this.amountOfSugar;
	}
	
	@Override
	public String toString()
	{
		return name;
	}
}












