import java.util.Scanner;

class kr_4_7
{
	private static double fact(double x)
	{
		double f = 1;
		for (int i = 2; i <= x; i++)
		{
			f = f*i;
		}
		return f;
	}
	
	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);
		int i = 1;
		double e, pow, x, eps, t;
		System.out.print("x = ");
		x = scan.nextDouble();
		
		pow = x;
		e = 1;
		eps = 0.00001;
		t = 1;
		
		while (Math.abs(t) > eps)
		{
			t = pow/fact(i);
			e += t;
			i++;
			pow *= x;
		}
		
		System.out.println(e);
		System.out.print(Math.exp(x));
		
		scan.close();
	}
}





