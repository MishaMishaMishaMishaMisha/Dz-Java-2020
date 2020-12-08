import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

class kr_collect_2_2
{
	public static void main(String[] args)
	{
		ArrayList<Integer> ar = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		int X, n;
		
		n = scan.nextInt();
		
		for (int i = 0; i < n; i++)
		{
			int number = ThreadLocalRandom.current().nextInt(- 100, 100);
			System.out.print(number + " ");
			ar.add(number);
		}
		System.out.print("\n");
		
		X = scan.nextInt();
		
		for (int i = 0; i < n; i++)
		{
			if (ar.get(i) >= X)
			{
				ar.add(ar.get(i));
				ar.remove(i);
			}
		}
		
		for (int i = 0; i < n; i++)
		{
			System.out.print(ar.get(i) + " ");
		}
		
		scan.close();
	}
}




