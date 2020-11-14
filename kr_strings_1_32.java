import java.util.Scanner;

class kr_strings_1_32
{
	public static char find(char c, int k)
	{
		String az = "abcdefghijklmnopqrstuvwxyz";
		
		int ind = az.indexOf(c);
		if (ind == -1)
		{
			return c;
		}
		return az.charAt((ind + k)%26);
	}
	
	public static String f(String s, int k)
	{
		String s1 = "";
		
		for (int i = 0; i < s.length(); i++)
		{
			s1 += find(s.charAt(i), k);
		}
		
		return s1;
	}

	
	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int k = scan.nextInt();
		
		System.out.println(f(s, k));
		
		scan.close();
	}
}