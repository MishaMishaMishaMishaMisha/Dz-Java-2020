import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;

class dz_textFiles_7
{
	public static void main(String[] args)
	{
		
        try(FileReader reader = new FileReader("textFile7read.txt"))
        {
        	try(FileWriter writer = new FileWriter("textFiles7write.txt", false))
        	{
            	BufferedReader breader = new BufferedReader(reader);
                String line = breader.readLine();
                while (line != null) 
                {
                	writer.write(" " + line + "\r\n");

                    line = breader.readLine();
                }
        	}
            catch(IOException ex)
            {
                 
                System.out.println(ex.getMessage());
            } 
        
        }
        catch(IOException ex)
        {
             
            System.out.println(ex.getMessage());
        }
		

	}
}





