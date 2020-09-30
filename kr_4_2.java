import java.util.Scanner;

class kr_4_2
{
	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);
		double a;
		double s = 0;
		int i = 0;
		
		while (true)
		{
			System.out.printf("a[%d] = ", i);
			a = scan.nextDouble();
			if (a == 0)
			{
				System.out.print(s);
				break;
			}
			i++;
			s += a;
		}
		
		scan.close();
	}
}