package dz_multi_3;

import java.util.ArrayList;

public class ParkingPlace extends Thread
{
	public Car currentCar;
	
	ParkingPlace(Car current)
	{
		super();
		
		currentCar = current;
		
		start();
	}
	
	public void run()
	{
		try
		{
			System.out.println("Машина" + currentCar.name + " приїхала на стоянку");
			
			if (Parking.freePlaces >= 1)
			{
				System.out.println("Машина" + currentCar.name + " зайняла вільне місце");
				Parking.freePlaces--;
				sleep(currentCar.parkingTime);
				System.out.println("Машина" + currentCar.name + " покинула стоянку");
				Parking.freePlaces++;
			}
			else
			{
				System.out.println("Машина" + currentCar.name + " чекає доки з'явиться вільне місце");
				sleep(currentCar.waitingTime);
				if (Parking.freePlaces >= 1)
				{
					System.out.println("Машина" + currentCar.name + " зайняла вільне місце");
					sleep(currentCar.parkingTime);
					System.out.println("Машина" + currentCar.name + " покинула стоянку");
					Parking.freePlaces++;
				}
				else
				{
					System.out.println("Машина" + currentCar.name + " не дочекалася вільного місця і поїхала");
				}
			}
		}
        catch (InterruptedException iex) 
        {
            iex.printStackTrace();
        }
	}
	
}
