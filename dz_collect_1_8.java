import java.util.HashSet;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
import java.util.Iterator;

class dz_collect_1_8
{
	public static HashSet peretin(HashSet s1, HashSet s2)
	{
		HashSet<Integer> set = new HashSet<Integer>();
		
	    Iterator<Integer> iterator = s1.iterator();
	    while (iterator.hasNext()) 
	    {
	        int num = iterator.next();
	    	if (s2.contains(num))
	    	{
	    		set.add(num);
	    	}
	    }
	    
	    iterator = set.iterator();
	    while (iterator.hasNext()) 
	    {
	    	System.out.print(iterator.next() + " ");
	    }
		
		return set;
	}
	
	public static HashSet obednannya(HashSet s1, HashSet s2)
	{
		HashSet<Integer> set = new HashSet<Integer>();
		
	    Iterator<Integer> iterator = s1.iterator();
	    while (iterator.hasNext()) 
	    {
	        set.add(iterator.next());
	    }
	    
	    iterator = s2.iterator();
	    while (iterator.hasNext()) 
	    {
	        set.add(iterator.next());
	    }
	    
	    iterator = set.iterator();
	    while (iterator.hasNext()) 
	    {
	    	System.out.print(iterator.next() + " ");
	    }
		
		return set;
	}
	
	public static void main(String[] args)
	{
		HashSet<Integer> set1 = new HashSet<Integer>();
		HashSet<Integer> set2 = new HashSet<Integer>();
		Scanner scan = new Scanner(System.in);
		int n1, n2;
		
		n1 = scan.nextInt();
		for (int i = 0; i < n1; i++)
		{
			int number1 = ThreadLocalRandom.current().nextInt(- 10, 10);
			set1.add(number1);
			System.out.print(number1 + " ");
		}
		System.out.print("\n");
		
		n2 = scan.nextInt();
		for (int i = 0; i < n2; i++)
		{
			int number2 = ThreadLocalRandom.current().nextInt(- 10, 10);
			set2.add(number2);
			System.out.print(number2 + " ");
		}
		System.out.print("\n\n");
		
		obednannya(set1, set2);
		peretin(set1, set2);
		
		scan.close();

	}
}