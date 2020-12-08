import java.io.*;

import java.util.Random;

class kr_binFiles_1
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
	
	
	public static double task1(String filename, int n)
	{
		createFile("file1");
		
		double sum = 0;
		Random r = new Random();
		
		try
		{
			DataInputStream in = new DataInputStream(new FileInputStream(filename + ".dat"));
			DataOutputStream out = new DataOutputStream(new FileOutputStream(filename + ".dat"));
			
			for (int i = 0; i < n; i++)
			{
				double number = - 10 + 20 * r.nextDouble();
				System.out.println(number);
				out.writeDouble(number);
			}
			
			while (true)
	        {
	            sum += in.readDouble();
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
		
		return sum;
	}
	
	public static int task2(String filename, int n)
	{
		createFile("file2"); 
		
		int count = 0;
		Random r = new Random();
		
		try
		{
			DataInputStream in = new DataInputStream(new FileInputStream(filename + ".dat"));
			DataOutputStream out = new DataOutputStream(new FileOutputStream(filename + ".dat"));
			
			for (int i = 0; i < n; i++)
			{
				double number = - 10 + 20 * r.nextDouble();
				System.out.println(number);
				out.writeDouble(number);
			}
			
			while (true)
	        {
	            double number1 = in.readDouble();
	            if (number1 < 0)
	            {
	            	count++;
	            }
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
		
		return count;
	}
	
	
	public static void main(String[] args)
	{	

		System.out.printf("Sum: %s\n\n", task1("file1", 5));
		System.out.println(task2("file2", 5));
	}
}














