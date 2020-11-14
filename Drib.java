package kr_OOP_3_1;

class Drib
{
	private int n;
	private int m;
	
	public Drib(int n, int m)
	{
		this.n = n;
		this.m = m;
		reduce();
	}
	
	public Drib()
	{
		this.n = 0;
		this.m = 1;
	}
	
	public Drib add(Drib drib2)
	{
		Drib res = new Drib(this.n * drib2.m + this.m * drib2.n, this.m * drib2.m);
		res.reduce();
		return res;
	}
	
	public int getN()
	{
		return this.n;
	}
	
	public int getM()
	{
		return this.m;
	}
	
	public static int gcd(int x, int y)
	{
		if (y == 0) 
		{
			return x;
		}
		return gcd(y, x%y);
	}
	
	public void reduce()
	{

		int max1 = n>m?n:m;
		int min1 = n<=m?n:m;

		int nsd = gcd(max1, min1);

		n /= nsd;
		m /= nsd;
	}
	
	@Override
	public String toString()
	{
		return String.valueOf(n) + "/" + String.valueOf(m);
	}
}




