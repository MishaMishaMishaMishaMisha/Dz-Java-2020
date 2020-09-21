import java.util.Scanner;

class dz_2_8
{
	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);
		int n1, n2;
		
		System.out.print("Input first number: ");
		n1 = scan.nextInt();
		System.out.print("Input second number: ");
		n2 = scan.nextInt();
		
		System.out.printf("n1 + n2 = %d\n", n1 + n2);
		System.out.printf("n1 - n2 = %d\n", n1 - n2);
		System.out.printf("n1 * n2 = %d\n", n1 * n2);
		System.out.printf("n1 / n2 = %d\n", n1 / n2);
		System.out.printf("n1 процент n2 = %d\n", n1 % n2);

		
		scan.close();
	}
}