import java.util.Scanner;

class kr_strings_2_1
{
	public static String replaceSpace(String s)
	{
		String s1 = s;
		while(s1.contains("  ")) {
		    String replace = s1.replace("  ", " ");
		    s1 = replace;
		}
		if (s1.charAt(0) == ' ')
		{
			return s1.substring(1);
		}
		return s1;
	}
	
	
	
	public static String f1(String s)
	{
		String[] ar = replaceSpace(s).split(" ");

		int d = -1;
		String word = "";
		for (int i = 0; i < ar.length; i++)
		{
			if (d < ar[i].length())
			{
				d = ar[i].length();
				word = ar[i];
			}
		}
		return word;
	}
	
	public static int f2(String s)
	{
		String[] ar = replaceSpace(s).split(" ");

		return ar.length;
	}
	
	public static String f3(String s)
	{
		String[] ar = replaceSpace(s).split(" ");
		
		String s1 = "";
		for (int i = 0; i < ar.length; i++)
		{
			if (ar[i].length() != 1)
			{
				s1 += ar[i] + " ";
			}
		}
		
		return s1.substring(0, s1.length() - 1);
	}
	
	public static String f4(String s)
	{
		String s1 = replaceSpace(s);
		if (s1.charAt(s1.length() - 1) == ' ')
		{
			return s1.substring(0, s1.length() - 1);
		}
		return s1;
	}
	
	public static String f5(String s)
	{
		String s1 = replaceSpace(s);
		if (s1.charAt(s1.length() - 1) == ' ')
		{
			s1 = s1.substring(0, s1.length() - 1);
		}
		
		int p = 80 - s1.length();
		String[] ar = s1.split(" ");
		
		int ind = 0;
		while (p != 0)
		{
			if (ind == ar.length - 1)
			{
				ind = 0;
			}
			ar[ind] += " ";
			ind++;
			p--;
		}
		
		String s2 = "";
		for (int i = 0; i < ar.length; i++)
		{
			s2 += ar[i] + " ";
		}
		
		return s2.substring(0, s2.length() - 1);
	}

	
	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		//System.out.println(f1(s));
		//System.out.println(f2(s));
		//System.out.println(f3(s));
		//System.out.println(f4(s));
		System.out.println(f5(s));
		
		scan.close();
	}
}





