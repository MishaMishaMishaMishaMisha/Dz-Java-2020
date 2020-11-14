import java.util.Scanner;

class kr_strings_1_6
{
	
	public static int f(String s)
	{
		int sum = s.charAt(0) - '0';
		for (int i = 1; i < s.length(); i += 2)
		{
			if (s.charAt(i) == '+')
			{
				sum += s.charAt(i + 1) - '0';
			}
			else if (s.charAt(i) == '-')
			{
				sum -= s.charAt(i + 1) - '0';
			}
		}
		
		return sum;
	}

	
	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);
		String s;
		s = scan.nextLine();
		
		System.out.println(f(s));
		
		scan.close();
	}
}