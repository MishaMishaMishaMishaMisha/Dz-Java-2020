import java.util.Scanner;

class kr_strings_1_1
{
	public static String f1(String s)
	{
		String s1 = s;
		s1 = s1.replaceAll("[0-9]", "");
		s1 = s1.replace("+", "++");
		s1 = s1.replace("-", "--");
		return s1;
	}
	
	public static String f2(String s)
	{
		String s1 = "";
		for (int i = 0; i < s.length(); i++)
		{
			if (i != s.length() - 1 && s.charAt(i) == '+' && Character.isDigit(s.charAt(i + 1)))
			{
				continue;
			}
			s1 += s.charAt(i);
		}
		
		return s1;
	}
	
	public static String f3(String s)
	{
		String s1 = "";
		for (int i = 0; i < s.length(); i++)
		{
			if (i != s.length() - 1 && s.charAt(i) == 'в' && s.charAt(i + 1) == 'с')
			{
				continue;
			}
			s1 += s.charAt(i);
		}
		
		return s1;
	}
	
	public static String f4(String s)
	{
		String s1 = s;
		s1 = s1.replaceAll("ph", "f");
		
		return s1;
	}
	
	public static String f5(String s)
	{
		String s1 = s;
		while(s1.contains("  ")) {
		    String replace = s1.replace("  ", " ");
		    s1 = replace;
		}
		return s1;
	}
	
	
	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);
		String s;
		s = scan.nextLine();
		
		System.out.println(f1(s));
		System.out.println(f2(s));
		System.out.println(f3(s));
		System.out.println(f4(s));
		System.out.println(f5(s));
		
		scan.close();
	}
}