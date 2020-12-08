import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

class kr_collect_2_1
{
	public static void main(String[] args)
	{
		ArrayList<Integer> arL = new ArrayList<Integer>();
		LinkedList<Integer> linkL = new LinkedList<Integer>();
		int N;
		Scanner scan = new Scanner(System.in);
		
		N = scan.nextInt();
		
		long time = System.currentTimeMillis();
		for (int i = 1; i <= N; i++)
		{
			arL.add(i);
		}
		System.out.println((double) (System.currentTimeMillis() - time));
		
		time = System.currentTimeMillis();
		for (int i = N; i >= 1; i--)
		{
			linkL.add(0, i);
		}
		System.out.println((double) (System.currentTimeMillis() - time));
		
		scan.close();
	}
}




