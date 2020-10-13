import java.util.Scanner;
import java.util.Random;

class Quadrangle
{
	private double x1, y1, x2, y2, x3, y3, x4, y4;
	
	public Quadrangle()
	{
		this.x1 = 0;
		this.y1 = 0;
		this.x2 = 0;
		this.y2 = 0;
		this.x3 = 0;
		this.y3 = 0;
		this.x4 = 0;
		this.y4 = 0;
	}
	
	public Quadrangle(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
	{
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
		this.x4 = x4;
		this.y4 = y4;
	}
	
	public double area()
	{
		// Формула площі Гаусса
		return Math.abs(x1*y2 - x2*y1 + x2*y3 - x3*y2 + x3*y4 - x4*y3 + x4*y1 - x1*y4)/2;
	}
	
	public double perimeter()
	{
		double s1 = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
		double s2 = Math.sqrt((x3 - x2)*(x3 - x2) + (y3 - y2)*(y3 - y2));
		double s3 = Math.sqrt((x4 - x3)*(x4 - x3) + (y4 - y3)*(y4 - y3));
		double s4 = Math.sqrt((x1 - x4)*(x1 - x4) + (y1 - y4)*(y1 - y4));
		return s1 + s2 + s3 + s4;
	}
	
	public String typeOfQuadrangle()
	{
		double s1 = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
		double s2 = Math.sqrt((x3 - x2)*(x3 - x2) + (y3 - y2)*(y3 - y2));
		double s3 = Math.sqrt((x4 - x3)*(x4 - x3) + (y4 - y3)*(y4 - y3));
		double s4 = Math.sqrt((x1 - x4)*(x1 - x4) + (y1 - y4)*(y1 - y4));
		
		double eps = 1e-6;
		if (Math.abs(s1 - s2) < eps && Math.abs(s2 - s3) < eps && Math.abs(s3 - s4) < eps)
		{
			// якщо всі сторони рівні і хоча б один кут прямий (скалярний добуток сусідніх векторів == 0) - квадрат, інакше - ромб
			if (Math.abs( (x2 - x1)*(x3 - x2) + (y2 - y1)*(y3 - y2) ) < eps)
			{
				return "Квадрат";
			}
			else
			{
				return "Ромб";
			}
		}
		else if ( (Math.abs(s1 - s3) < eps && Math.abs(s2 - s4) < eps) && (Math.abs( (x2 - x1)*(x3 - x2) + (y2 - y1)*(y3 - y2) ) < eps) )
		{
			// якщо протилежні сторони рівні і хоча б один кут прямий - прямокутник
			return "Прямокутник";
		}
		else
		{
			return "Довільний";
		}
	}
}
	
class dz_OOP_2_8
{
	public static void main(String[] args)
	{	
		double rangeMin = - 100;
		double rangeMax = 100;
		
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		Quadrangle[] ar;
		int n;
		double x1, y1, x2, y2, x3, y3, x4, y4;
		
		int countKvadrat = 0;
		double maxSKvadrat = 0;
		double maxPKvadrat = 0;
		double minSKvadrat = 0;
		double minPKvadrat = 0;
		
		int countRomb = 0;
		double maxSRomb = 0;
		double maxPRomb = 0;
		double minSRomb = 0;
		double minPRomb = 0;
		
		int countPryamk = 0;
		double maxSPryamk = 0;
		double maxPPryamk = 0;
		double minSPryamk = 0;
		double minPPryamk = 0;
		
		int countDov = 0;
		double maxSDov = 0;
		double maxPDov = 0;
		double minSDov = 0;
		double minPDov = 0;
		
		System.out.print("Кількість чотирикутників: ");
		n = scan.nextInt();
		ar = new Quadrangle[n];
		
		for (int i = 0; i < n; i++)
		{
			x1 = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
			y1 = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
			x2 = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
			y2 = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
			x3 = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
			y3 = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
			x4 = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
			y4 = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
			
			ar[i] = new Quadrangle(x1, y1, x2, y2, x3, y3, x4, y4);
			
			if (ar[i].typeOfQuadrangle().equals("Квадрат"))
			{
				countKvadrat++;
				if (ar[i].area() >= maxSKvadrat)
				{
					maxSKvadrat = ar[i].area();
				}
				if (ar[i].perimeter() >= maxPKvadrat)
				{
					maxPKvadrat = ar[i].perimeter();
				}
				if (minSKvadrat == 0 || ar[i].area() <= minSKvadrat)
				{
					minSKvadrat = ar[i].area();
				}
				if (minPKvadrat == 0 || ar[i].perimeter() <= minPKvadrat)
				{
					minPKvadrat = ar[i].perimeter();
				}
			}
			else if (ar[i].typeOfQuadrangle().equals("Ромб"))
			{
				countRomb++;
				if (ar[i].area() >= maxSRomb)
				{
					maxSRomb = ar[i].area();
				}
				if (ar[i].perimeter() >= maxPRomb)
				{
					maxPRomb = ar[i].perimeter();
				}
				if (minSRomb == 0 || ar[i].area() <= minSRomb)
				{
					minSRomb = ar[i].area();
				}
				if (minPRomb == 0 || ar[i].perimeter() <= minPRomb)
				{
					minPRomb = ar[i].perimeter();
				}
			}
			else if (ar[i].typeOfQuadrangle().equals("Прямокутник"))
			{
				countPryamk++;
				if (ar[i].area() >= maxSPryamk)
				{
					maxSPryamk = ar[i].area();
				}
				if (ar[i].perimeter() >= maxPPryamk)
				{
					maxPPryamk = ar[i].perimeter();
				}
				if (minSPryamk == 0 || ar[i].area() <= minSPryamk)
				{
					minSPryamk = ar[i].area();
				}
				if (minPPryamk == 0 || ar[i].perimeter() <= minPPryamk)
				{
					minPPryamk = ar[i].perimeter();
				}
			}
			else
			{
				countDov++;
				if (ar[i].area() >= maxSDov)
				{
					maxSDov = ar[i].area();
				}
				if (ar[i].perimeter() >= maxPDov)
				{
					maxPDov = ar[i].perimeter();
				}
				if (minSDov == 0 || ar[i].area() <= minSDov)
				{
					minSDov = ar[i].area();
				}
				if (minPDov == 0 || ar[i].perimeter() <= minPDov)
				{
					minPDov = ar[i].perimeter();
				}
			}
		}
		
		System.out.printf("Кількість квадратів: %d, макс площа: %f, макс периметр: %f, мін площа: %f, мін периметр: %f\n", countKvadrat, maxSKvadrat, maxPKvadrat, minSKvadrat, minPKvadrat);
		System.out.printf("Кількість ромбів: %d, макс площа: %f, макс периметр: %f, мін площа: %f, мін периметр: %f\n", countRomb, maxSRomb, maxPRomb, minSRomb, minPRomb);
		System.out.printf("Кількість прямокутників: %d, макс площа: %f, макс периметр: %f, мін площа: %f, мін периметр: %f\n", countPryamk, maxSPryamk, maxPPryamk, minSPryamk, minPPryamk);
		System.out.printf("Кількість довільних чотирикутників: %d, макс площа: %f, макс периметр: %f, мін площа: %f, мін периметр: %f\n", countDov, maxSDov, maxPDov, minSDov, minPDov);

		scan.close();
	}
}

