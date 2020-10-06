import java.util.Scanner;

class kr_5_2
{
	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);
		int n;
		double m = 0;
		double s = 0;
		
		System.out.print("n = ");
		n = scan.nextInt();
		double mas[] = new double[n];
		
		for (int i = 0; i < n; i++)
		{
			System.out.printf("number%d = ", i + 1);
			mas[i] = scan.nextDouble();
			m += mas[i];
		}
		
		m = m/n;
		System.out.printf("mean: %f\n", m);
		
		for (int i = 0; i < n; i++)
		{
			s += (mas[i] - m)*(mas[i] - m);
		}
		
		s = s/n;
		System.out.printf("sample standard deviation: %f", Math.sqrt(s));
		
		scan.close();
	}
}