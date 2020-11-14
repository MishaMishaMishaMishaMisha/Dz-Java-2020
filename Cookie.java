package dz_OOP_5_2;

public class Cookie extends Sweets
{
	TypeOfCookie type;
	
	Cookie()
	{
		super();
		type = TypeOfCookie.NONE;
		
	}
	
	Cookie(int weight, int amountOfSugar, String name, TypeOfCookie type)
	{
		super(weight, amountOfSugar, name);
		this.type = type;
	}
	
	void setTypeOfCookie(TypeOfCookie type)
	{
		this.type = type;
	}
	
	TypeOfCookie getTypeOfCookie()
	{
		return this.type;
	}
}


enum TypeOfCookie
{
	normal,
	chocolate,
	NONE
}
