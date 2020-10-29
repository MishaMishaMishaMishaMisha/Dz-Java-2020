package kr_OOP_4_1;

class Word
{
	private String word;

	public Word()
	{
		this.word = "";
	}
	
	public Word(String word)
	{
		this.word = word;
	}
	
	public String getWord()
	{
		return this.word;
	}
	
	public void setWord(String word)
	{
		this.word = word;
	}
	
	@Override
	public String toString()
	{
		return this.word;
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
	    
	    Word w = (Word) obj;
	    return word == w.getWord() || (word != null &&word.equals(w.getWord()));
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int res = 1;
		res = prime + ((word == null) ? 0 : word.hashCode());
		return res;
	}
}