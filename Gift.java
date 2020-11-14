package dz_OOP_5_2;

public class Gift
{
	int size;
	Sweets[] sweets;
	int weight;
	
	Gift()
	{
		size = 0;
		sweets = new Sweets[size];
		weight = 0;
	}
	
	void add(Sweets x)
	{

		Sweets[] t = new Sweets[size + 1];
		for (int i = 0; i < size; i++)
		{
			t[i] = sweets[i];
		}
		t[size] = x;
		
		size++;
		sweets = new Sweets[size];
		for (int i = 0; i < size; i++)
		{
			sweets[i] = t[i];
		}
		weight += x.getWeight();
	}
	
	int getWeight()
	{
		return weight;
	}
	
	void sortByWeight()
	{ 	
		for (int i = size - 1; i > 0; i--)
		{
			int k = 0;
			for (int j = 0; j < i; j++)
			{
				if (sweets[j].getWeight() > sweets[j + 1].getWeight())
				{
					Sweets t = sweets[j];
					sweets[j] = sweets[j + 1];
					sweets[j + 1] = t;
					k = 1;
				}
			}
			if (k == 0)
			{
				break;
			}
		}
	}
	
	void sortBySugar()
	{ 	
		for (int i = size - 1; i > 0; i--)
		{
			int k = 0;
			for (int j = 0; j < i; j++)
			{
				if (sweets[j].getAmountOfSugar() > sweets[j + 1].getAmountOfSugar())
				{
					Sweets t = sweets[j];
					sweets[j] = sweets[j + 1];
					sweets[j + 1] = t;
					k = 1;
				}
			}
			if (k == 0)
			{
				break;
			}
		}
	}
	
	Sweets getBySugar(int a, int b)
	{
		for (Sweets it : sweets)
		{
			if (it.getAmountOfSugar() >= a && it.getAmountOfSugar() <= b)
			{
				return it;
			}
		}
		return new Sweets();
	}
	
	void printSweets()
	{
		String res = "";
		for (Sweets it : sweets)
		{
			if (it instanceof Sweets)
			{
				res += it.getName() + " ";
			}
		}
		System.out.println(res);
	}
	

	
	public static void main(String[] args)
	{
		Candy s1 = new Candy(5, 12, "Ромашка", TypeOfCandy.chocolate);
		Candy s2 = new Candy(8, 10, "Чупа-Чупс", TypeOfCandy.lollipop);
		Cookie s3 = new Cookie(2, 6, "Печиво1", TypeOfCookie.chocolate);
		Cookie s4 = new Cookie(3, 8, "Печиво2", TypeOfCookie.normal);
		
		Gift g = new Gift();
		g.add(s1);
		g.add(s2);
		g.add(s3);
		g.add(s4);
		
		System.out.printf("Вага подарунка: %d\n", g.getWeight());
		System.out.print("Сортування за вагою: ");
		g.sortByWeight();
		g.printSweets();
		System.out.print("Сортування за вмістом цукру: ");
		g.sortBySugar();
		g.printSweets();
		System.out.println("Цукерка з вмістом цукру в діапазоні від 9 до 11" + g.getBySugar(9, 11));
	}
}	
	
	
	
	
	
	
	
	
	
	