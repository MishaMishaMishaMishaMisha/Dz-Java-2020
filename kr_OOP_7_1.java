interface Edition
{
    void advertise();
    void print();
}

abstract class Book implements Edition
{
    @Override
    public void print()
    {
        System.out.println("Book is printing");
    }
    
    @Override
    public void advertise()
    {
        System.out.println("Book is advertised");
    }
    
    public void popular()
    {
        System.out.println("Book now is very popular");
    }

}

class Directory extends Book
{
    protected String name;
    protected String author_name;
    protected String author_surname;
    protected float price;
    
    Directory(String name, String author_name, String author_surname, float price)
    {
        this.name = name;
        this.author_name = author_name;
        this.author_surname = author_surname;
        this.price = price;
    }

    @Override
    public void print()
    {
        System.out.println("Directory " + this.name + " is printing");
    }
    
    @Override
    public void advertise()
    {
        System.out.println("Directory " + this.name + "  is advertised");
    }

    @Override
    public void popular()
    {
        System.out.println("Directory " + this.name + " is popular");
    }

    @Override
    public String toString()
    {
        return "Directory " + this.name + " is published by " + this.author_name + " " + this.author_surname;
    }
}

class Encyclopedia extends Book
{
    protected String name;
    protected String genre;
    protected float price;
    
    Encyclopedia(String name, String genre, float price)
    {
        this.name = name;
        this.genre = genre;
        this.price = price;
    }

    @Override
    public void print()
    {
        System.out.println("Encyclopedia " + this.name + " is printing");
    }
    @Override
    public void advertise()
    {
        System.out.println("Encyclopedia " + this.name + " is advertised");
    }

    @Override
    public void popular()
    {
        System.out.println("Encyclopedia " + this.name + " is popular");
    }

    @Override
    public String toString()
    {
        return "Directory " + this.name + " has " + this.genre + " genre";
    }
}



class kr_OOP_7_1
{
	public static void main(String[] args)
	{	
		Directory d = new Directory("ABV", "Petya", "Vasechkin", 999);
		Encyclopedia e = new Encyclopedia("QWE", "Space", 5000);
		
		d.print();
		d.advertise();
		d.popular();
		
		e.print();
		e.advertise();
		e.popular();
		
	}
}