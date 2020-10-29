package dz_OOP_5_2;

public class Candy extends Sweets
{
	TypeOfCandy type;
	
	Candy()
	{
		super();
		type = TypeOfCandy.NONE;
		
	}
	
	Candy(int weight, int amountOfSugar, String name, TypeOfCandy type)
	{
		super(weight, amountOfSugar, name);
		this.type = type;
	}
	
	void setTypeOfCandy(TypeOfCandy type)
	{
		this.type = type;
	}
	
	TypeOfCandy getTypeOfCandy()
	{
		return this.type;
	}
}


enum TypeOfCandy
{
	chocolate,
	marmalade,
	lollipop, // смоктальна цукерка
	chicle,    // жувательна цукерка
	NONE
}
