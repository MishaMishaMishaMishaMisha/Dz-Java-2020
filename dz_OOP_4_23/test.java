package dz_OOP_4_23;

class test
{
	public static void main(String[] args)
	{
		Predator pr = new Predator(7, "Лев", 29, 5);
		System.out.println(pr);
		pr.growl();
		pr.sleep();
		pr.hunt();
		pr.run();
	}
}



