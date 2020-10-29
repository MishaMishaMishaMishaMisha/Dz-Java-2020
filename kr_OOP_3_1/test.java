package kr_OOP_3_1;

class test
{
	public static void main(String[] args)
	{	
		Polynom[] p = new Polynom[4];
		p[0] = new Polynom(1,3, 2,7, 6,7);
		p[1] = new Polynom(3,4);
		p[2] = new Polynom(1,2, 4,1);
		p[3] = new Polynom(4,3, 0, 5, 1,6);
		
		Polynom res = Polynom.add(p[0], p[1]);
		res = Polynom.add(res, p[2]);
		res = Polynom.add(res, p[3]);
		
		System.out.println(res);
		
	}
}