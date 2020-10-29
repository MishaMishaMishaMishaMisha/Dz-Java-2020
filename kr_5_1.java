import java.util.Scanner;

class kr_5_1
{
	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);
		String s;
		int min, max;
		
		s = scan.nextLine();
		
		String s1[] = s.split(" ");
		int ar[] = new int[s1.length];
		for (int i = 0; i < s1.length; i++)
		{
			ar[i] = Integer.parseInt(s1[i]);
		}
		
		//min
		min = ar[0];
		for (int i = 0; i < s1.length; i++)
		{
			if (ar[i] < min)
			{
				min = ar[i];
			}
		}
		
		//max
		max = 0;
		for (int i = 0; i < s1.length; i++)
		{
			if (ar[i] > max)
			{
				max = ar[i];
			}
		}
		
		System.out.printf("Min: %d\n", min);
		System.out.printf("Max: %d\n", max);
		
		scan.close();
	}
}