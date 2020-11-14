package kr_OOP_5_1;

public abstract class Plant
{
	private String name;
	private double price;
	private int color;
	private int time;
	
	public Plant()
	{
		name = "";
		price = 0;
		color = 0;
		time = 0;
	}
	
	public Plant(String name, double price, int color, int time)
	{
		this.name = name;
		this.price = price;
		this.color = color;
		this.time = time;
	}
	
	protected void setName(String name)
	{
		this.name = name;
	}
	
	protected String getName()
	{
		return this.name;
	}
	
	protected void setPrice(double price)
	{
		this.price = price;
	}
	
	protected double getPrice()
	{
		return this.price;
	}
	
	protected void setColor(int color)
	{
		this.color = color;
	}
	
	protected int getColor()
	{
		return this.color;
	}
	
	protected void setTime(int time)
	{
		this.time = time;
	}
	
	protected int getTime()
	{
		return this.time;
	}
	
	@Override
	public String toString()
	{
		return name;
	}
}