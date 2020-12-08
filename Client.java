package kr_multi_12;

public class Client extends Thread
{
    private int time = 3100;
    int id;
    int dish;

    Client(int id, int dish) 
    {
        super("client" + id);
    	this.id = id;
        this.dish = dish;
        start();
    }

    void eat()
    {
        System.out.println("Клієнт"+ id + " їсть блюдо" + dish);
    }

    @Override
    public void run() 
    {
        try 
        {
            sleep(time);
            eat();
        } 
        catch (InterruptedException message) 
        {
            message.printStackTrace();
        }
    }
}



