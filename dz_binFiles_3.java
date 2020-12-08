import java.io.*;
import java.util.Random;

class dz_binFiles_3
{
	public static void createFile(String filename)
	{
        File newFile = new File(filename + ".dat");
        try
        {
            boolean created = newFile.createNewFile();
            if(created)
            {
                System.out.println("File has been created");
            }
        }
        catch(IOException ex)
        {
             
            System.out.println(ex.getMessage());
        } 
	}
	
	
	public static boolean contains(int[] a, int num) 
	{
	    for (int i = 0; i < a.length; i++) 
	    {
	        if (a[i] == num) 
	        {
	            return true;
	        }
	    }
	    return false;
	}
	
	public static void func(String fileIN, String fileOUT, int n)
	{
		createFile(fileIN);
		createFile(fileOUT);
		Random r = new Random();
		
		try
		{
			DataInputStream inRead = new DataInputStream(new FileInputStream(fileIN + ".dat"));
			DataOutputStream inWrite = new DataOutputStream(new FileOutputStream(fileIN + ".dat"));
			DataOutputStream outWrite = new DataOutputStream(new FileOutputStream(fileOUT + ".dat"));
			
			for (int i = 0; i < n; i++)
			{
				int number = r.nextInt(200) - 100; // range -100, 100
				System.out.println(number);
				inWrite.writeInt(number);
			}
			
			while (true)
	        {
	            int number = inRead.readInt();
	            // парні числа
	            if (number % 2 == 0)
	            {
	            	outWrite.writeInt(number);
	            }
	            
	            /*
	            числа, які діляться на 3 і на 5
	            if (number % 3 == 0 & number % 5 == 0)
	            {
	            	outWrite.writeInt(number);
	            }
	            
	            числа, які є квадратом числа
	            if (number < 0):
	            	continue;
	            
	            int temp = (int) Math.sqrt(number) + 0.5;
	            if (temp*temp == number):
	            {
	            	outWrite.writeInt(number);
	            }
	            
	        числа, записані в зворотньому порядку
	        int[] ar = new int[n];
	        int ind = 0;
	        while (true)
	        {
	            int number = inRead.readInt();
	            ar[ind] = number;
	            ind++;
	        }
	        for (int i = n - 1; i >= 0; i--)
	        {
	        	outWrite.writeInt(ar[i]);
	        }
	        
	        числа без повторів
	        int[] b = new int[n];
			int ind = 0;
			while(true)
			{
				int number = inReadInt();
			    if (!contains(b, number))) 
			    {
			        b[ind] = number;
			        ind++;
			    }
			}
			for (int i = 0; i < ind + 1; i++)
	        {
	        	outWrite.writeInt(b[i]);
	        }
	            
	            */
	            
	        }
		}
		catch (FileNotFoundException e) 
		{
            System.out.println(e.getMessage());
        } 
		catch (IOException e) 
		{
            System.out.println(e.getMessage());
        }
		
	}
	
	
	public static void main(String[] args)
	{	
		func("dz_fileIN", "dz_fileOUT", 10);

	}
}



