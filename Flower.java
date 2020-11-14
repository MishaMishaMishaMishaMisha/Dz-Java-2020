package kr_OOP_5_1;

public class Flower extends Plant
{
	boolean smell;
	double length;
	
	Flower()
	{
		super();
		smell = false;
		length = 0;
	}
	
	Flower(String name, double price, int color, int time, boolean smell, double length)
	{
		super(name, price, color, time);
		this.smell = smell;
		this.length = length;
	}
	
	void setSmell(boolean smell)
	{
		this.smell = smell;
	}
	
	boolean getSmell()
	{
		return this.smell;
	}
	
	void setLength(double length)
	{
		this.length = length;
	}
	
	double getLenght()
	{
		return this.length;
	}
}
