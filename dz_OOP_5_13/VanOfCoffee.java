package dz_OOP_5_13;

public class VanOfCoffee
{
	private int size;
	private double volume;
	private double cost;
	private Coffee[] cof;
	
	public VanOfCoffee()
	{
		size = 0;
		volume = 0;
		cost = 0;
		cof = new Coffee[size];
	}
	
	public VanOfCoffee(double v, double c)
	{
		size = 0;
		volume = v;
		cost = c;
		cof = new Coffee[size];
	}
	
	public void setVolume(double v)
	{
		volume = v;
	}
	
	public double getVolume()
	{
		return volume;
	}
	
	public void setCost(double c)
	{
		cost = c;
	}
	
	public double getCost()
	{
		return cost;
	}
	
	public boolean addCoffee(Coffee x)
	{
		if (x.getVolume() > volume || x.getPrice() > cost)
		{
			return false;
		}
		
		Coffee[] t = new Coffee[size + 1];
		for (int i = 0; i < size; i++)
		{
			t[i] = cof[i];
		}
		t[size] = x;
		
		size++;
		cof = new Coffee[size];
		for (int i = 0; i < size; i++)
		{
			cof[i] = t[i];
		}
		
		volume -= x.getVolume();
		cost -= x.getPrice();
		return true;
	}
	
	public void sort()
	{
		for (int i = size - 1; i > 0; i--)
		{
			int k = 0;
			for (int j = 0; j < i; j++)
			{
				if (cof[j].getPrice()*cof[j].getWeight() > cof[j + 1].getPrice()*cof[j + 1].getWeight())
				{
					Coffee t = cof[j];
					cof[j] = cof[j + 1];
					cof[j + 1] = t;
					k = 1;
				}
			}
			if (k == 0)
			{
				break;
			}
		}
	}
	
	Coffee getByFresh(int a, int b)
	{
		for (Coffee it : cof)
		{
			if (it.getTime() >= a && it.getTime() <= b)
			{
				return it;
			}
		}
		return new Coffee();
	}
	
	void printCoffees()
	{
		String res = "";
		for (Coffee it : cof)
		{
			if (it instanceof Coffee)
			{
				res += it.getName() + " ";
			}
		}
		System.out.println(res);
	}
}


