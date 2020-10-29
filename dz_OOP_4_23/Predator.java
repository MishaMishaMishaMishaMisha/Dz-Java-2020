package dz_OOP_4_23;

public class Predator
{
	private int age;
	private String kind;
	private Claws claws;
	private Teeth teeth;
	
	public Predator()
	{
		age = 0;
		kind = "";
		claws = new Claws();
		teeth = new Teeth();
	}
	
	public Predator(int age, String kind, int count, int length)
	{
		this.age = age;
		this.kind = kind;
		teeth = new Teeth(count);
		claws = new Claws(length);
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public int getAge()
	{
		return this.age;
	}	
	
	public void setKind(String kind)
	{
		this.kind = kind;
	}
	
	public String getKind()
	{
		return this.kind;
	}
	
	public void growl()
	{
		System.out.println(kind + " ричить");
	}
	
	public void run()
	{
		System.out.println(kind + " біжить");
	}
	
	public void sleep()
	{
		System.out.println(kind + " спить");
	}
	
	public void hunt()
	{
		System.out.println(kind + " добуває їжу");
	}
	
	@Override
	public String toString()
	{
		return "Хижак " + kind + " у віці " + String.valueOf(age) + " років має " + String.valueOf(teeth.getCount()) + 
				 " зубів та кігті довжиною " + String.valueOf(claws.getLength()) + " сантиметрів";
	}
	
}