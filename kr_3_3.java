import java.util.Scanner;

class kr_3_3
{
	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		
		System.out.print("�����: ");
		a = scan.nextInt();
		System.out.print("����: ");
		b = scan.nextInt();
		System.out.print("��: ");
		c = scan.nextInt();
		
		if ((a < 1 && a > 12 && b < 1 && b > 31 && c < 2000 && c > 2100) || ((a == 4 || a == 6 || a == 9 || a == 11)) && b == 31 || (a == 2 && b == 29 && ((c%4 != 0 || c%100 == 0 && c%400 != 0))))
		{
			System.out.print("���� ����������");
		}
		else
		{
			if (a == 1)
			{
				System.out.printf("%d ���� %d ����", b, c);
			}
			else if (a == 2)
			{
				System.out.printf("%d ������ %d ����", b, c);
			}
			else if (a == 3)
			{
				System.out.printf("%d ������� %d ����", b, c);
			}
			else if (a == 4)
			{
				System.out.printf("%d ����� %d ����", b, c);
			}
			else if (a == 5)
			{
				System.out.printf("%d ������ %d ����", b, c);
			}
			else if (a == 6)
			{
				System.out.printf("%d ������ %d ����", b, c);
			}
			else if (a == 7)
			{
				System.out.printf("%d ����� %d ����", b, c);
			}
			else if (a == 8)
			{
				System.out.printf("%d ������ %d ����", b, c);
			}
			else if (a == 9)
			{
				System.out.printf("%d ������� %d ����", b, c);
			}
			else if (a == 10)
			{
				System.out.printf("%d ������ %d ����", b, c);
			}
			else if (a == 11)
			{
				System.out.printf("%d ��������� %d ����", b, c);
			}
			else
			{
				System.out.printf("%d ������ %d ����", b, c);
			}
		}
		
		scan.close();
	}
}