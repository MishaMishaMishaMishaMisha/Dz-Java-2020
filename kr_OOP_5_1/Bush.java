package kr_OOP_5_1;

public class Bush extends Plant
{
	private int live;
	
	Bush()
	{
		super();
		live = 0;
	}
	
	Bush(String name, double price, int color, int time, int live)
	{
		super(name, price, color, time);
		this.live = live;
	}
	
	void setLive(int live)
	{
		this.live = live;
	}
	
	int getLive()
	{
		return this.live;
	}
}