import java.util.Scanner;

class Airlane
{
	private String destination;
	private int numberOfFlight;
	private String typeOfPlane;
	private int timeHour;
	private int timeMinute;
	private String day;
	
	public Airlane(String destination, int numberOfFlight, String typeOfPlane, int timeHour, int timeMinute, String day)
	{
		this.destination = destination;
		this.numberOfFlight = numberOfFlight;
		this.typeOfPlane = typeOfPlane;
		this.timeHour = timeHour;
		this.timeMinute = timeMinute;
		this.day = day;
	}
	
	public Airlane()
	{
		this.destination = null;
		this.numberOfFlight = 0;
		this.typeOfPlane = null;
		this.timeHour = 0;
		this.timeMinute = 0;
		this.day = null;
	}
	
	public String getDestination()
	{
		return this.destination;
	}
	
	public int getNumberOfFlight()
	{
		return this.numberOfFlight;
	}
	
	public String getTypeOfPlane()
	{
		return this.typeOfPlane;
	}
	
	public int getTimeHour()
	{
		return this.timeHour;
	}
	
	public int getTimeMinute()
	{
		return this.timeMinute;
	}
	
	public String getDay()
	{
		return this.day;
	}
	
	public void setDestination(String destination)
	{
		this.destination = destination;
	}
	
	public void setNumberOfFlight(int numberOfFlight)
	{
		this.numberOfFlight = numberOfFlight;
	}
	
	public void setTypeOfPlane(String typeOfPlane)
	{
		this.typeOfPlane = typeOfPlane;
	}
	
	public void setTimeHour(int timeHour)
	{
		this.timeHour = timeHour;
	}
	
	public void setTimeMinute(int timeMinute)
	{
		this.timeMinute = timeMinute;
	}
	
	public void setDay(String day)
	{
		this.day = day;
	}
	
	@Override
	public String toString()
	{
		return "Літак " + typeOfPlane + " номер " + String.valueOf(numberOfFlight) + " полетить в " + destination + " у " + day + " в " + String.valueOf(timeHour) + ":" + String.valueOf(timeMinute);
	}
	
}

class dz_OOP_1_12
{
	private static String task1(Airlane[] ar, String destination)
	{
		String res = "";
		int k = 1;
		for (int i = 0; i < ar.length; i++)
		{	
			if (ar[i].getDestination().equals(destination))
			{
				res += String.valueOf(k++) + ". " + ar[i].toString() + "\n";
			}
		}
		
		if (res == "")
		{
			return "Таких рейсів не знайдено";
		}
		else
		{
			return res;
		}
	}
	
	private static String task2(Airlane[] ar, String day)
	{
		String res = "";
		int k = 1;
		for (int i = 0; i < ar.length; i++)
		{
			if (ar[i].getDay().equals(day))
			{
				res += String.valueOf(k++) + ". " + ar[i].toString() + "\n";
			}
		}
		
		if (res == "")
		{
			return "Таких рейсів не знайдено";
		}
		else
		{
			return res;
		}
	}
	
	private static String task3(Airlane[] ar, String day, int timeHour, int timeMinute)
	{
		String res = "";
		int k = 1;
		for (int i = 0; i < ar.length; i++)
		{
			if (ar[i].getDay().equals(day))
			{
				if (ar[i].getTimeHour() > timeHour || (ar[i].getTimeHour() == timeHour && ar[i].getTimeMinute() >= timeMinute))
				{
					res += String.valueOf(k++) + ". " + ar[i].toString() + "\n";
				}
			}
		}
		
		if (res == "")
		{
			return "Таких рейсів не знайдено";
		}
		else
		{
			return res;
		}
	}
	
	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);
		Airlane[] ar;
		int n;
		String s;
		int t1, t2;
		
		System.out.print("1. Ввести список рейсів літаків з консолі\n2. Працювати з даними рейсами\n (введіть 1 або 2)\n");
		n = scan.nextInt();
		
		if (n == 1)
		{
			System.out.print("Кількість рейсів: ");
			n = scan.nextInt();
			ar = new Airlane[n];
			
			String dest, type, day;
			int number, hour, minute;
			for (int i = 0; i < n; i++)
			{
				System.out.print("Пункт призначення: ");
				dest = scan.next();
				System.out.print("Тип літака: ");
				type = scan.next();
				System.out.print("Номер літака: ");
				number = scan.nextInt();
				System.out.print("Час вильоту (година): ");
				hour = scan.nextInt();
				System.out.print("Час вильоту (хвилини): ");
				minute = scan.nextInt();
				System.out.print("День тижня: ");
				day = scan.next();
				
				ar[i] = new Airlane(dest, number, type, hour, minute, day);
				System.out.print("\n");
			}
			
			System.out.print("\n");
			for (int i = 0; i < n; i++)
			{
				System.out.printf("%d. ", i+1);
				System.out.print(ar[i].toString() + "\n");
			}
			
		}
		else
		{
			ar = new Airlane[5];
			
			ar[0] = new Airlane("Одеса", 12, "Ty-134", 12, 45, "П'ятниця");
			ar[1] = new Airlane("Париж", 54, "Ty-204", 20, 30, "Середа");
			ar[2] = new Airlane("Москва", 12, "Ty-134", 6, 15, "П'ятниця");
			ar[3] = new Airlane("Одеса", 53, "Іл-96-300", 16, 25, "Понеділок");
			ar[4] = new Airlane("Львів", 31, "Ty-154", 8, 30, "Субота");
			
			for (int i = 0; i < 5; i++)
			{
				System.out.printf("%d. ", i+1);
				System.out.print(ar[i].toString() + "\n");
			}
		}
		
		System.out.print("\n");
		System.out.print("Введіть пункт призначення, для якого потрібно вивести список рейсів: ");
		s = scan.next();
		System.out.println(task1(ar, s));
		
		System.out.print("\n");
		System.out.print("Введіть день тижня, для якого потрібно вивести список рейсів: ");
		s = scan.next();
		System.out.println(task2(ar, s));
		
		System.out.print("\n");
		System.out.print("Введіть день тижня та час, для яких потрібно вивести список рейсів: \n");
		System.out.print("День тижня: ");
		s = scan.next();
		System.out.print("Час (година): ");
		t1 = scan.nextInt();
		System.out.print("Час (хвилини): ");
		t2 = scan.nextInt();
		System.out.println(task3(ar, s, t1, t2));
		
		scan.close();
	}
}

