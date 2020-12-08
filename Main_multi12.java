package kr_multi_12;

import java.util.Scanner;

class Main_multi12
{
	public static void main(String[] args)
	{	
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть кількість клієнтів: ");
        int n = scan.nextInt();

        generalThread runThread = new generalThread(n);
	}
}