package dz_multi_3;

import java.util.ArrayList;

public class Parking
{
	public static int freePlaces;
	public ArrayList<Car> cars;
	
	Parking(int freePlaces, ArrayList<Car> cars)
	{
		this.freePlaces = freePlaces;
		this.cars = new ArrayList<>(cars);
	}
	
	public void startParking()
	{
		while (!cars.isEmpty())
		{
			ParkingPlace pc = new ParkingPlace(cars.remove(0));
		}
	}
	
}