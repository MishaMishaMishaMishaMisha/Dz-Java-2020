import java.util.Scanner;

class kr_3_2
{
	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);
		double a, b, c, D, x1, x2, eps;
		eps = 1e-8;
		
		System.out.print("a = ");
		a = scan.nextDouble();
		System.out.print("b = ");
		b = scan.nextDouble();
		System.out.print("c = ");
		c = scan.nextDouble();
		
		if (Math.abs(a) < eps)
		{
			if (Math.abs(b) < eps)
			{
				if (Math.abs(c) < eps)
				{
					System.out.print("безліч розв'язків");
				}
				else
				{
					System.out.print("розв'язків немає");
				}
			}
			else
			{
				System.out.printf("xl = x2 = %f", (-c)/b);
			}
		}
		else
		{
			D = b*b - 4*a*c;
			
			if (D < 0)
			{
				System.out.printf("x1 = %f + i*%f\n", (-b)/(2*a), Math.sqrt(-D)/(2*a));
				System.out.printf("x2 = %f - i*%f", (-b)/(2*a), Math.sqrt(-D)/(2*a));
			}
			else if (D > 0)
			{
				x1 = (-b + Math.sqrt(D))/(2*a);
				x2 = (-b - Math.sqrt(D))/(2*a);
				System.out.printf("x1 = %f\nx2 = %f", x1, x2);
			}
			else
			{
				x1 = (-b)/(2*a);
				System.out.printf("x1 = x2 = %f", x1);
			}
		}
		
		scan.close();
	}
}