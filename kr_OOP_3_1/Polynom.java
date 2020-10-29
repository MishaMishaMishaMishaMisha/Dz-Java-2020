package kr_OOP_3_1;

class Polynom
{
	private Drib[] coef;
	private int size;
	
	public Polynom(int size)
	{
		this.size = size;
		this.coef = new Drib[size];
		
		for (int i = 0; i < size; i++)
		{
			coef[i] = new Drib(0, 1);
		}
	}
	
	public Polynom(Integer... args)
	{
		this.size = args.length/2;
		coef = new Drib[size];
		
		for (int i = 0; i < size * 2; i += 2)
		{
			coef[i/2] = new Drib(args[i], args[i + 1]);
		}
	}
	
	public static Polynom add(Polynom poly1, Polynom poly2)
	{	
        int new_size = Math.max(poly1.size, poly2.size);
        Polynom res = new Polynom(new_size);

        for (int i = 0; i < new_size; i++)
        {
            if (i < poly1.size)
            	{
            		res.coef[new_size - 1 - i] = res.coef[new_size - 1 - i].add(poly1.coef[poly1.size - 1 - i]);
            	}
            if (i < poly2.size)
            	{
            		res.coef[new_size - 1 - i] = res.coef[new_size - 1 - i].add(poly2.coef[poly2.size - 1 - i]);
            	}
        }
        
		return res;
	}
	
	@Override
	public String toString()
	{
		String res = "";
		
		for (int i = size - 1; i >= 0; i--)
		{
			if (coef[i].getN() == 0)
			{
				continue;
			}
			res += coef[size - 1 - i] + "*x^" + String.valueOf(i);
			
			if (i != 0)
			{
				res += " + ";
			}
		}
		
		return res;
	}
}



