import java.util.Scanner;

class dz_5_9
{
	private static boolean isPalindrom(String s)
	{
		for (int k = 0; k < s.length()/2; k++)
		{
			if (s.charAt(k) != s.charAt(s.length() - k - 1))
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);
		int n;
		int k = 0;
		String s;
		String s1 = "";
		
		System.out.print("n = ");
		n = scan.nextInt();

		for (int i = 0; i < n; i++)
		{
			System.out.printf("number%d = ", i + 1);
			s = scan.next();
			
			if (k != 2 && s.length() != 1 && isPalindrom(s))
			{
				s1 = s;
				k++;
			}
		}
		
		if (s1 != "")
		{
			System.out.print(s1);
		}
		else
		{
			System.out.print("поліндромів не має");
		}
		
		scan.close();
	}
}