import java.util.Scanner;

class kr_1_2
{
	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);
		double x, y, g;
		
		System.out.print("x = ");
		x = scan.nextInt();
		System.out.print("y = ");
		y = scan.nextInt();
		g = 2/(1/x + 1/y);
		
		System.out.printf("������� ������� � �: %d\n", (int) Math.log10(x) + 1);
		System.out.printf("������� ������� � y: %d\n", (int) Math.log10(y) + 1);
		System.out.printf("������ ���������: %.2f", g);
		
		scan.close();
	}
}