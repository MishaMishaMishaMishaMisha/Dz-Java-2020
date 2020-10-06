import java.util.Random;
import java.util.Scanner;

class kr_6_2
{
	public static void showMatr(int matr[][], int n)
	{
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				System.out.printf("%4d", matr[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void shiftRight(int[][] ar, int n, int steps)
	{
	    int m[][] = new int[n][n];
	    for (int i = 0; i < n; i++)
	    {
	    	for (int j = 0; j < n; j++)
	    	{
	    		m[i][j] = ar[i][j];
	    	}
	    }
		
		for (int i = 0; i < n; i++) 
	    {
	    	int realSteps = steps%n;
	        while(realSteps-- > 0)
	        {
	        	int temp = m[i][n - 1];
	        	for (int j = 0; j < n; j++)
	        	{
	 	            int val = m[i][j];
		            m[i][j] = temp;
		            temp = val;  
	        	}
	        }
	   }
	   System.out.printf("Зсув вправо на %d позицій\n", steps);
	   showMatr(m, n);
	}	
	
	public static void shiftLeft(int[][] ar, int n, int steps)
	{
	    int m[][] = new int[n][n];
	    for (int i = 0; i < n; i++)
	    {
	    	for (int j = 0; j < n; j++)
	    	{
	    		m[i][j] = ar[i][j];
	    	}
	    }
		
		for (int i = 0; i < n; i++) 
	    {
	    	int realSteps = steps%n;
	        while(realSteps-- > 0)
	        {
	        	int temp = m[i][0];
	        	for (int j = n - 1; j >= 0; j--)
	        	{
	 	            int val = m[i][j];
		            m[i][j] = temp;
		            temp = val;  
	        	}
	        }
	   }
	   System.out.printf("Зсув вліво на %d позицій\n", steps);
	   showMatr(m, n);
	}
	
	public static void shiftUp(int[][] ar, int n, int steps)
	{
	    int m[][] = new int[n][n];
	    for (int i = 0; i < n; i++)
	    {
	    	for (int j = 0; j < n; j++)
	    	{
	    		m[i][j] = ar[i][j];
	    	}
	    }
		
		for (int i = 0; i < n; i++) 
	    {
	    	int realSteps = steps%n;
	        while(realSteps-- > 0)
	        {
	        	int temp = m[0][i];
	        	for (int j = n - 1; j >= 0; j--)
	        	{
	 	            int val = m[j][i];
		            m[j][i] = temp;
		            temp = val;  
	        	}
	        }
	   }
	   System.out.printf("Зсув вгору на %d позицій\n", steps);
	   showMatr(m, n);
	}
	
	public static void shiftDown(int[][] ar, int n, int steps)
	{
	    int m[][] = new int[n][n];
	    for (int i = 0; i < n; i++)
	    {
	    	for (int j = 0; j < n; j++)
	    	{
	    		m[i][j] = ar[i][j];
	    	}
	    }
		
		for (int i = 0; i < n; i++) 
	    {
	    	int realSteps = steps%n;
	        while(realSteps-- > 0)
	        {
	        	int temp = m[n - 1][i];
	        	for (int j = 0; j < n; j++)
	        	{
	 	            int val = m[j][i];
		            m[j][i] = temp;
		            temp = val;  
	        	}
	        }
	   }
	   System.out.printf("Зсув вниз на %d позицій\n", steps);
	   showMatr(m, n);
	}
	
	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		int n, k;
		
		System.out.print("n = ");
		n = scan.nextInt();
		
		//int mas1[][] = new int[n][n];
		int mas2[][] = new int[n][n];
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				//System.out.printf("mas[%d][%d] = ", i, j);
				//mas1[i][j] = scan.nextInt();
				
				mas2[i][j] = r.nextInt(2*n) - n;
			}
		}
		
		//showMatr(mas1, n);
		showMatr(mas2, n);
		
		System.out.print("k = ");
		k = scan.nextInt();
		
		shiftRight(mas2, n, k);
		shiftLeft(mas2, n, k);
		shiftUp(mas2, n, k);
		shiftDown(mas2, n, k);
		
		scan.close();
	}
}

