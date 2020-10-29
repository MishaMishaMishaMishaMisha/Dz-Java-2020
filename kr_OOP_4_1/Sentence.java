package kr_OOP_4_1;

class Sentence
{
	private Word[] sentence;
	private int size;
	
	public Sentence()
	{
		this.size = 1;
		this.sentence = new Word[this.size];
		this.sentence[0] = new Word();
	}
	
	public Sentence(String sentence)
	{
		String s1[] = sentence.split(" ");
		this.size = s1.length;
		this.sentence = new Word[this.size];
		for (int i = 0; i < this.size; i++)
		{
			this.sentence[i] = new Word(s1[i]);
		}
	}
	
	public Word[] getSentence()
	{
		return this.sentence;
	}
	
	public void setSentence(String sentence)
	{
		String s1[] = sentence.split(" ");
		this.size = s1.length;
		this.sentence = new Word[this.size];
		for (int i = 0; i < this.size; i++)
		{
			this.sentence[i] = new Word(s1[i]);
		}
	}
	
	@Override
	public String toString()
	{
		String res = "";
		for (int i = 0; i < this.size; i++)
		{
			res += this.sentence[i].toString() + " ";
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
	    
	    Sentence s = (Sentence) obj;
	    if (s.size != this.size)
	    {
	    	return false;
	    }
	    for (int i = 0; i < this.size; i++)
	    {
	    	if (!s.sentence[i].equals(this.sentence[i]))
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
			res = prime*res + ((this.sentence[i] == null) ? 0 : this.sentence[i].hashCode());
		}
		return res;
	}
}