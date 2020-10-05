import java.util.Random;
import java.util.Scanner;

class dz_6_12
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
	
	public static void swapRows(int matr[][], int n, int r1, int r2)
	{
		for (int i = 0; i < n; i++)
		{
			int temp = matr[r2 - 1][i];
			matr[r2 - 1][i] = matr[r1 - 1][i];
			matr[r1 - 1][i] = temp;
		}
	}
	
	public static void swapColumns(int matr[][], int n, int c1, int c2)
	{
		for (int i = 0; i < n; i++)
		{
			int temp = matr[i][c2 - 1];
			matr[i][c2 - 1] = matr[i][c1 - 1];
			matr[i][c1 - 1] = temp;
		}
	}
	
	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		int n;
		
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
		
		showMatr(mas2, n);
		
		int min = mas2[0][0];
		int imin = 0;
		int jmin = 0;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if (mas2[i][j] <= min)
				{
					min = mas2[i][j];
					imin = i;
					jmin = j;
				}
			}
		}
		
		System.out.printf("Мінімальний елемент m[%d][%d] = %d\n", imin + 1, jmin + 1, min);
		
		int i1, j1;
		System.out.println("Введіть номер рядка і номер стовпчика елемента, на місце якого треба поміcтити мінімальний");
		System.out.print("i = ");
		i1 = scan.nextInt();
		i1--;
		System.out.print("j = ");
		j1 = scan.nextInt();
		j1--;
		
		while (true)
		{
			if (imin == i1 && jmin == j1)
			{
				break;
			}
			
			if (imin < i1)
			{
				swapRows(mas2, n, imin + 1, imin + 2);
				imin++;
			}
			else if (imin > i1)
			{
				swapRows(mas2, n, imin + 1, imin);
				imin--;
			}
			
			if (jmin < j1)
			{
				swapColumns(mas2, n, jmin + 1, jmin + 2);
				jmin++;
			}
			else if (jmin > j1)
			{
				swapColumns(mas2, n, jmin + 1, jmin);
				jmin--;
			}
		}
		
		showMatr(mas2, n);
		
		scan.close();
	}
}

