package dz_OOP_5_13;

class test
{
	public static void main(String[] args)
	{
		Coffee c1 = new Coffee("Coffee1", 10.0, 3, 10, Condition.corn);
		Coffee c2 = new Coffee("Coffee2", 70.0, 1, 6, Condition.instant);
		Coffee c3 = new Coffee("Coffee3", 10.5, 6, 15, Condition.ground);
		Coffee c4 = new Coffee("Coffee4", 25.0, 2, 2, Condition.corn);
		
		VanOfCoffee v = new VanOfCoffee(200, 500);
		v.addCoffee(c1);
		v.addCoffee(c2);
		v.addCoffee(c3);
		v.addCoffee(c4);
		
		System.out.print("Кава, свіжість якої знаходиться в діапазоні між 8 і 12: ");
		System.out.println(v.getByFresh(8, 12));
		
		System.out.print("Відсортований список кави по співвідношенню ціна вага: ");
		v.sort();
		v.printCoffees();
	}
}

