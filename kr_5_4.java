import java.util.Scanner;

class kr_5_4
{
	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);
		double x, y, z, x1, y1, z1;
		double xmin = 0;
		double ymin = 0;
		double zmin = 0;
		int n;
		
		System.out.print("x = ");
		x = scan.nextDouble();
		System.out.print("y = ");
		y = scan.nextDouble();
		System.out.print("z = ");
		z = scan.nextDouble();
		
		System.out.print("Кількість точок: ");
		n = scan.nextInt();
		
		double d = 0;
		double dmin = 1e10;
		
		for (int i = 0; i < n; i++)
		{
			System.out.print("x = ");
			x1 = scan.nextDouble();
			System.out.print("y = ");
			y1 = scan.nextDouble();
			System.out.print("z = ");
			z1 = scan.nextDouble();
			
			d = Math.sqrt((x - x1)*(x - x1) + (y - y1)*(y - y1) + (z - z1)*(z - z1));
			if (d <= dmin)
			{
				dmin = d;
				xmin = x1;
				ymin = y1;
				zmin = z1;
			}
		}
		System.out.println(dmin);
		System.out.printf("x = %f, y = %f, z = %f", xmin, ymin, zmin);
		
		scan.close();
	}
}