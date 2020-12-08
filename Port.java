package kr_multi_1;

import java.util.ArrayDeque;

public class Port 
{
    final int maxContainers;
    int currentContainers;
    ArrayDeque<Ship> ships;

    Port(int max, int current, ArrayDeque<Ship> ships)
    {
        maxContainers = max;
        currentContainers = current;
        ships = new ArrayDeque<>(ships);
    }

    public void work()
    {
        int i = 1;
        while (!ships.isEmpty()) 
        {
            Dock dock = new Dock(i++, ships.remove(), maxContainers, currentContainers);
        }

        currentContainers = Dock.maxPortContainers;
    }
}