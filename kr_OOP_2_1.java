import java.util.Scanner;

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
	
	public Drib substruct(Drib drib2)
	{
		Drib res = new Drib(this.n * drib2.m - this.m * drib2.n, this.m * drib2.m);
		res.reduce();
		return res;
	}
	
	public Drib mult(Drib drib2)
	{
		Drib res = new Drib(this.n * drib2.n, this.m * drib2.m);
		res.reduce();
		return res;
	}
	
	public Drib div(Drib drib2)
	{
		Drib res = new Drib(this.n * drib2.m, this.m * drib2.n);
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

class kr_OOP_2_1
{
	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);
		
		int k, n, m;
		System.out.print("k = ");
		k = scan.nextInt();
		
		Drib[] d = new Drib[k];
		
		for (int i = 0; i < k; i++)
		{
			System.out.printf("n%d = ", i + 1);
			n = scan.nextInt();
			System.out.printf("m%d = ", i + 1);
			m = scan.nextInt();
			
			d[i] = new Drib(n, m);
		}
		
		for (int i = 0; i < k - 1; i++)
		{
			d[i] = d[i].add(d[i + 1]);
		}
		
		System.out.print("\n");
		for (int i = 0; i < k; i++)
		{
			System.out.print(d[i].toString() + " ");
		}
		System.out.print("\n");
		
		scan.close();
	}
}





