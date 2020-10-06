import java.util.Scanner;

class kr_1_1
{
	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);
		String s;
		
		System.out.println("Введіть прізвище");
		s = scan.next();
		System.out.print("Привіт " + s);
		
		scan.close();
	}
}