package dz_OOP_7_8;

public class CargoShip implements Ship
{
	protected String name;
	protected String typeOfweight;
	protected float weight;
	
	public CargoShip(String name, String typeOfweight, float weight)
	{
		this.name = name;
		this.typeOfweight = typeOfweight;
		this.weight = weight;
	}
	
	public void sail()
	{
		System.out.println("Вантажний корабель відпливає");
	}
	
	public void arrive()
	{
		System.out.println("Вантажний корабель прибув у місце призначення");
	}
	
	@Override
	public String toString()
	{
		return "Вантажний корабель " + name + " перевозить вантаж " + typeOfweight + " вагою " + weight;
	}
}