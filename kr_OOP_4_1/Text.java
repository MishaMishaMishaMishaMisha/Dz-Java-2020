package kr_OOP_4_1;

class Text
{
	private Sentence[] text;
	private String title;
	private int size;
	
	public Text()
	{
		this.size = 1;
		this.text = new Sentence[this.size];
		this.text[0] = new Sentence();
		this.title = "";
	}
	
	public Text(String title, String text)
	{
		this.title = title;
		String s1[] = text.split(" \\.");
		
		this.size = s1.length;
		this.text = new Sentence[this.size];
		for (int i = 0; i < this.size; i++)
		{
			this.text[i] = new Sentence(s1[i]);
		}
	}
	
	public Sentence[] getText()
	{
		return this.text;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public void setText(String text)
	{
		String s1[] = text.split(" \\.");
		
		this.size = s1.length;
		this.text = new Sentence[this.size];
		for (int i = 0; i < this.size; i++)
		{
			this.text[i] = new Sentence(s1[i]);
		}
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	@Override
	public String toString()
	{
		String res = "";
		res = "              " + title + "               \n";
		for (int i = 0; i < this.size; i++)
		{
			res += this.text[i].toString();
		}
		return res;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
		{
			return true;
		}
		
	    if (obj == null || obj.getClass() != this.getClass()) 
	    {
	        return false;
	    }
	    
	    Text t = (Text) obj;
	    if (t.size != this.size)
	    {
	    	return false;
	    }
	    for (int i = 0; i < this.size; i++)
	    {
	    	if (!t.text[i].equals(this.text[i]))
	    	{
	    		return false;
	    	}
	    }
	    return true;
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int res = 1;
		res = prime + this.size;
		for (int i = 0; i < this.size; i++)
		{
			res = prime*res + ((this.text[i] == null) ? 0 : this.text[i].hashCode());
		}
		res = prime*res + ((this.title == null) ? 0 : this.title.hashCode());
		return res;
	}
	
	public void addToText(String sentences)
	{
		String t = "";
		for (int i = 0; i < this.size; i++)
		{
			t += this.text[i].toString();
		}
		t += sentences;
		
		String s1[] = t.split(" \\.");
		this.size = s1.length;
		this.text = new Sentence[this.size];
		for (int i = 0; i < this.size; i++)
		{
			this.text[i] = new Sentence(s1[i]);
		}
	}
}