import java.util.Scanner;

class kr_strings_1_8
{
	public static void f1(String s)
	{
		// не зрозумів умову в пункті а)
	}
	
	public static boolean f2(String s)
	{
		if (!Character.isDigit(s.charAt(0)) || s.charAt(0) - '0' != s.length() - 1)
		{
			return false;
		}
		
		for (int i = 1; i < s.length(); i++)
		{
			if (!Character.isLetter(s.charAt(i)))
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean f3(String s)
	{
		int k = 0;
		for (int i = 0; i < s.length(); i++)
		{
			if (Character.isLetter(s.charAt(i)))
			{
				continue;
			}
			else if (Character.isDigit(s.charAt(i)))
			{
				k++;
				if (k > 1 || s.charAt(i) - '0' != s.length())
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean f4(String s)
	{
		int sum = 0;
		for (int i = 0; i < s.length(); i++)
		{
			if (Character.isDigit(s.charAt(i)))
			{
				sum += s.charAt(i) - '0';
			}
		}
		
		if (sum == s.length())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean f5(String s)
	{
		if (!Character.isDigit(s.charAt(0)) || s.length() > 10 - (s.charAt(0) - '0'))
		{
			return false;
		}
		
		for (int i = 1; i < s.length(); i++)
		{
			if (!Character.isDigit(s.charAt(i)) || (s.charAt(i) - '0') != (s.charAt(i - 1) - '0') + 1)
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean f6(String s)
	{
		String s1 = s;
		int d;
		s1 = s1.replaceAll(" ", "");
		
		if (s1.length() == 1)
		{
			if (Character.isDigit(s1.charAt(0)))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		if (!Character.isDigit(s1.charAt(1)))
		{
			return false;
		}
		else
		{
			d = (s1.charAt(1) - '0') - (s1.charAt(0) - '0');
		}
		
		for (int i = 2; i < s1.length(); i++)
		{
			if (!Character.isDigit(s1.charAt(i)))
			{
				return false;
			}
			
			int t = (s1.charAt(i) - '0') - (s1.charAt(i - 1) - '0');
			if (t != d)
			{
				return false;
			}
		}
	
		return true;
	}

	
	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);
		String s;
		s = scan.nextLine();
		
		//System.out.println(f1(s));
		System.out.println(f2(s));
		System.out.println(f3(s));
		System.out.println(f4(s));
		System.out.println(f5(s));
		System.out.println(f6(s));
		
		scan.close();
	}
}