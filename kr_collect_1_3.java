import java.io.*;
import java.util.HashMap;

class kr_collect_1_3
{

	public static void main(String[] args) throws IOException
	{
        HashMap<Integer,Integer> dict = new HashMap<>();
        int key = 0;
   
        try 
        {
        	DataInputStream dis = new DataInputStream(new FileInputStream("bfile.dat"));
        	while (true) 
            {
            	String[] infoArr = dis.readLine().split(" ");
                int value = 0;
                for (String sbi : infoArr) 
                {
                    byte[] sbiBytes = sbi.trim().getBytes();
                    String a = "";
                    for (int i = 0; i < sbiBytes.length; i += 2) 
                    {
                    	a += Byte.toString(sbiBytes[i]);
                    }

                    if (a.isEmpty()) continue;
                    value = Integer.parseInt(a);
                    dict.put(key,value);
                    key+=1;
                }
            }
        }
		catch (FileNotFoundException e) 
		{
            System.out.println(e.getMessage());
        } 
	    catch (EOFException | NullPointerException ignored) 
        {
	    }

	}
}


