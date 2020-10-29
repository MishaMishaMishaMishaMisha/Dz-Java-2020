package dz_OOP_5_13;

public class Coffee
{
	private String name;
	private double price;
	private double weight;
	private int time;
	private Condition cond;
	
	public Coffee()
	{
		price = 0;
		weight = 0;
		time = 0;
	}
	
	public Coffee(String name, double price, double weight, int time, Condition cond)
	{
		this.name = name;
		this.price = price;
		this.weight = weight;
		this.time = time;
		this.cond = cond;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	public double getWeight()
	{
		return this.weight;
	}
	
	public void setTime(int time)
	{
		this.time = time;
	}
	
	public double getTime()
	{
		return this.time;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setCondition(Condition cond)
	{
		this.cond = cond;
	}
	
	public Condition getCondition()
	{
		return this.cond;
	}
	
	@Override
	public String toString()
	{
		return name;
	}
	
	public double getVolume()
	{
		// нехай 1 кг кави у вигляді зерна займає об'єм 5, мелена кава - 10, розчинная - 15
		if (cond == Condition.corn)
		{
			return weight*5;
		}
		else if (cond == Condition.ground)
		{
			return weight*10;
		}
		else
		{
			return weight*15;
		}
	}
}

enum Condition    // кава у вигляді зерна, меленого або розчинного
{
	corn,    
	ground,
	instant
}