package kr_multi_1;

public class Dock extends Thread 
{
    int id;
    String name;
    Ship currentShip;

    public static int maxPortContainers, curPortContainers;

    Dock(int id, Ship currentShip, int maxC, int curC)
    {
        super("Dock " + id);
        name = "Dock " + id;
        System.out.println(name + " created!");

        this.id = id;
        this.currentShip = currentShip;

        curPortContainers = curC;
        maxPortContainers = maxC;

        start();
    }

    public void run() 
    {
        unload();
        System.out.println("Розвантаження з " + name + " завершено.");
        load();
        System.out.println("Завантаження в " + name + " завершено.");
    }

    void unload() 
    {
        int curC = currentShip.containersCurrent;
        int maxC = currentShip.containersMax;
        
        try 
        {
            while (currentShip.containersCurrent-- > 0 && curPortContainers < maxPortContainers) 
            {
                System.out.println(name + " корабель розвантажуеться...");
                curPortContainers++;
                Thread.sleep(2000);
            }
            System.out.println(name + " поточна кількість контейнерів: " + curPortContainers);
        } 
        catch (InterruptedException iex) 
        {
            System.out.println("error");
        }
    }

    void load() 
    {
        try 
        {
            while (currentShip.containersCurrent++ < currentShip.containersMax && maxPortContainers > 0) 
            {
                System.out.println(name + " корабель завантажуеться...");
                curPortContainers--;
                Thread.sleep(2000);
            }
            System.out.println(name + " поточна кількість контейнерів: " + currentShip.containersCurrent);
        } 
        catch (InterruptedException iex) 
        {
            System.out.println("error");
        }
    }
}






