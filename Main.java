package dz_multi_3;

import java.util.ArrayList;

class Main
{
	public static void main(String[] args)
	{	
		ArrayList<Car> cars = new ArrayList<>();
		
		cars.add(new Car(500, 3000, 1));
		cars.add(new Car(330, 2000, 2));
		cars.add(new Car(200, 3500, 3));
		cars.add(new Car(800, 2600, 4));
		cars.add(new Car(300, 3000, 5));
		
		
		Parking p = new Parking(2, cars);
		p.startParking();
	}
}

