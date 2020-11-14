import java.util.Scanner;

class dz_strings_1_5
{
	public static String f(String s)
	{
		String s1 = "";
		int k = 0;
		for (int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			if (c != ',' && c != '!' && c != '?')
			{
				s1 += c;
				k++;
				if (k == 6)
				{
					k = 0;
					s1 += "\n";
				}
			}
			else
			{
				s1 += c + "\n";
				k = 0;
			}
		}
		return s1;
	}
	
	
	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);
		String s;
		s = scan.nextLine();
		
		System.out.println(f(s));
		/*
		 Введений текст: woid,wowekpckcookwc,o,odsckoscp
		 
		 Вихідні рядки:
						woid,
						wowekp
						ckcook
						wc,
						o,
						odscko
						scp
		 */
		
		scan.close();
	}
}




