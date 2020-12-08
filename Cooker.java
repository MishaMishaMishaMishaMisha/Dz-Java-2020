package kr_multi_12;


public class Cooker extends Thread
{
    private int time = 2130;

    Cooker() 
    {
    	start();
    }

    public void cook(int current_client, int dish) throws InterruptedException 
    {
        System.out.println("Кухар готує блюдо" + dish + " для " + current_client);
    }

    @Override
    public void run() 
    {
        try 
        {
            sleep(time);
        } 
        catch (InterruptedException message) 
        {
            message.printStackTrace();
        }
    }
}