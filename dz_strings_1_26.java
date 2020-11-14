import java.util.Scanner;

class dz_strings_1_26
{
	public static String f(String s)
	{
		String s1 =  "";
		s1 += s.charAt(0);
		for (int i = 1; i < s.length(); i++)
		{
			if (s.charAt(i) == s.charAt(i - 1))
			{
				continue;
			}
			s1 += s.charAt(i);
		}
		
		return s1;
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