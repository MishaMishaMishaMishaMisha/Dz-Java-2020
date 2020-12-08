import java.io.*;

import java.util.HashMap;
import java.util.Stack;
import java.util.ArrayList;

class kr_collect_1_1and2
{
	
	public static void task1()
	{
		ArrayList<String> ar = new ArrayList<String>();
		
        try(FileReader r = new FileReader("collectRead.txt"))
        {
            BufferedReader reader = new BufferedReader(r);

            String line = reader.readLine();
            while (line != null) {

                ar.add(line);
            	
                line = reader.readLine();
            }
        }
        catch(IOException ex)
        {
             
            System.out.println(ex.getMessage());
        }
		
		
        try(FileWriter writer = new FileWriter("collectWrite.txt", false))
        {
        	for (int i = ar.size() - 1; i >= 0; i--) 
        	{
        		writer.write(ar.get(i) + "\r\n");
        	}
             
            writer.flush();
        }
        catch(IOException ex)
        {
             
            System.out.println(ex.getMessage());
        } 
	}
	
	public static int task2(int number)
	{
		String res = "";
		
		Stack<Integer> st = new Stack<Integer>();

		int div = 1;
		while (div <= number)
		{
		    div *= 10;
		}
		div /= 10;
		while (div > 0)
		{
		    int digit = number / div;
		    number -= digit * div;
		    st.add(digit);
		    div /= 10;
		}
		
		for (int i = st.size() - 1; i >= 0; i--)
		{
			if (st.get(i) == 0 & i == 0)
			{
				continue;
			}
			
			res += st.get(i).toString();
		}
		
		return Integer.valueOf(res);
	}
	
	
	
	public static void main(String[] args) throws IOException
	{
		task1();
		System.out.println(task2(12340));

	}
}
