package kr_multi_12;

public class Waiter extends Thread
{
    private int time = 600;

    Waiter()
    {
        start();
    }

    void carry(int current_client, int dish) 
    {
        System.out.println("Офіціант несе блюдо" + dish + " до клієнта" + current_client);
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