import java.util.Scanner;

class dz_4_4
{
	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);
		int n;
		int k = 0;
		boolean poz;
		
		System.out.print("������ ����� ����������� ��� 0: ");
		n = scan.nextInt();
		if (n == 0)
		{
			System.out.printf("ʳ������ ��� �����: %d", k);
		}
		else
		{
			while (true)
			{
				if (n > 0)
				{
					poz = true;
				}
				else if (n < 0)
				{
					poz = false;
				}
				else
				{
					break;
				}
				
				System.out.print("������ ����� ����������� ��� 0: ");
				n = scan.nextInt();
				
				if (n < 0 && poz)
				{
					k++;
				}
				
				if (n > 0 && !poz)
				{
					k++;
				}	
			}
			
			System.out.printf("ʳ������ ��� �����: %d", k);
		}
		
		
		scan.close();
	}
}