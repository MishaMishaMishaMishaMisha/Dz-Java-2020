import java.util.Scanner;

class dz_strings_2_4
{
	public static void f(String s)
	{
		int plus = 0;
		int minus = 0;
		int mult = 0;
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) == '+')
			{
				plus++;
			}
			else if (s.charAt(i) == '-')
			{
				minus++;
			}
			else if (s.charAt(i) == '*')
			{
				mult++;
			}
			else
			{
				continue;
			}
		}
		
		System.out.printf("Кількість входжень символу '+': %d\n", plus);
		System.out.printf("Кількість входжень символу '-': %d\n", minus);
		System.out.printf("Кількість входжень символу '*': %d\n", mult);
	}
	
	
	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);
		String s;
		s = scan.nextLine();
		
		f(s);
		
		scan.close();
	}
}




