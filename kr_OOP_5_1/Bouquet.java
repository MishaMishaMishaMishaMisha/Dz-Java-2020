package kr_OOP_5_1;

public class Bouquet
{
	int size;
	Plant[] flowers;
	
	Bouquet()
	{
		size = 0;
		flowers = new Plant[size];
	}
	
	void addFlower(Plant x)
	{

		Plant[] t = new Plant[size + 1];
		for (int i = 0; i < size; i++)
		{
			t[i] = flowers[i];
		}
		t[size] = x;
		
		size++;
		flowers = new Plant[size];
		for (int i = 0; i < size; i++)
		{
			flowers[i] = t[i];
		}
	}
	
	boolean removeFlower(Plant x)
	{
		int k = 0;
		for (Plant it : flowers)
		{
			if (it.equals(x))
			{
				for (int i = k; i < flowers.length; i++)
				{
					flowers[k] = flowers[k + 1];
				}
			}
			k++;
		}
		
		return false;
	}
	
	double getPrice()
	{
		double sum = 0;
		for (Plant it : flowers)
		{
			sum += it.getPrice();
		}
		return sum;
	}
	
	void sortByFresh()
	{ 	
		for (int i = size - 1; i > 0; i--)
		{
			int k = 0;
			for (int j = 0; j < i; j++)
			{
				if (flowers[j].getTime() > flowers[j + 1].getTime())
				{
					Plant t = flowers[j];
					flowers[j] = flowers[j + 1];
					flowers[j + 1] = t;
					k = 1;
				}
			}
			if (k == 0)
			{
				break;
			}
		}
	}
	
	Flower getByLength(double a, double b)
	{
		for (Plant it : flowers)
		{
			if (it instanceof Flower)
			{
				Flower z = (Flower) it;
				if (z.getLenght() >= a && z.getLenght() <= b)
				{
					return z;
				}
			}
		}
		return new Flower();
	}
	
	void printFlowers()
	{
		String res = "";
		for (Plant it : flowers)
		{
			if (it instanceof Flower)
			{
				res += it.getName() + " ";
			}
		}
		System.out.println(res);
	}
	

	
	public static void main(String[] args)
	{
		Flower rose1 = new Flower("Роза1", 25.0, 3, 21, true, 17.5);
		Flower rose2 = new Flower("Роза2", 15.0, 5, 10, true, 8.0);
		Flower lilia = new Flower("Лілія", 12.5, 1, 12, false, 11.4);
		Bush b = new Bush("Куст", 2, 2, 32, 23);
		
		Bouquet buk = new Bouquet();
		buk.addFlower(rose1);
		buk.addFlower(rose2);
		buk.addFlower(lilia);
		buk.addFlower(b);
		
		double p = buk.getPrice();
		Flower x = buk.getByLength(10, 20);
		
		System.out.println(p);
		System.out.println(x);
		
		buk.printFlowers();
		buk.sortByFresh();
		buk.printFlowers();
	}
}	
	
	
	
	
	
	
	
	
	
	