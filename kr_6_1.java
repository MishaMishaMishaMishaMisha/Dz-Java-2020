import java.util.Random;
import java.util.Scanner;

class kr_6_1
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
	
	public static int[][] sortByRow(int matr[][], int n, int k)
	{
	    int ind = n - 1;
	    int id, max;
	    while (ind > 0) 
	    {
	        id = 0;
	        for (int j = 1; j <= ind; j++)
	        {
	            if (matr[k][j] > matr[k][id])
	            {
	                id = j;
	            }
	        }
	        for (int i = 0; i < n; i++) 
	        {
	            max = matr[i][id];
	            matr[i][id] = matr[i][ind];
	            matr[i][ind] = max;
	        }
	        ind -= 1;
	    }
	    return matr;
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
		k--;
		
		System.out.printf("Сортування за %d рядком\n", k + 1);
		//showMatr(sortByRow(mas1, n, k), n);
	    showMatr(sortByRow(mas2, n, k), n);
		
		scan.close();
	}
}

