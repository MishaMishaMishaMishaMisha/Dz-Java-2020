import java.util.Scanner;

class kr_4_1
{
	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);
		int x;
		
		System.out.print("x = ");
		x = scan.nextInt();
		
		if (x <= 0)
		{
			System.out.print("число не натуральне");
		}
		else
		{
			int i = 1;
			int fact = 1;
			
			while (i <= x)
			{
				fact *= i;
				i++;
			}
			System.out.print(fact);
		}
		
		scan.close();
	}
}