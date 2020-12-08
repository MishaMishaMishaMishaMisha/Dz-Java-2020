package kr_multi_12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class generalThread extends Thread 
{
    ArrayList<Integer> clients;
    HashMap<Integer, Integer> dishes;

    generalThread(int n)
    {
        clients = new ArrayList<Integer>();
    	for (int i = 1; i <= n; i++)
        {
        	clients.add(i);
        }
        
        dishes = new HashMap<>();
        for (Integer c: clients) 
        {
        	dishes.put(c, 1);
        }

        start();
    }

    static int getNewClient(ArrayList<Integer> arr) 
    {
        int prev = arr.get(0);
        int c;

        if ((new Random()).nextBoolean())
        {
            for (int i = 1; i < arr.size(); i++)
            {
                c = arr.get(i);
                if (c < prev)
                {
                    arr.remove(i);
                    return c;
                }
                prev = c;
            }
        }

        c = arr.get(0);
        arr.remove(0);
        return c;
    }

    @Override
    public void run() 
    {
        int current;
        while (!(clients.isEmpty()))
        {
            current = getNewClient(clients);
            int dish = dishes.get(current);

            if (dish < 3)
            {
            	clients.add(current);
                dishes.put(current, dish + 1);
            }

            try 
            {
                Cooker cooker = new Cooker();
                cooker.join();
                cooker.cook(current, dish);
                Waiter waiter = new Waiter();
                waiter.join();
                waiter.carry(current, dish);
                Client client = new Client(current, dish);

            } 
            catch (InterruptedException iex) 
            {
                iex.printStackTrace();
            }
        }
    }

}