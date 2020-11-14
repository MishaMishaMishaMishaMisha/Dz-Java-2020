package dz_OOP_7_8;

class test
{
	public static void main(String[] args)
	{
		CargoShip cs = new CargoShip("Корабель1", "Зерно", 123543);
		Tanker t = new Tanker("Танкер3", 9643234);
		
		cs.sail();
		cs.arrive();
		System.out.println(cs.toString());
		
		t.sail();
		t.arrive();
		System.out.println(t.toString());
	}
}