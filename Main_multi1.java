package kr_multi_1;

import java.util.ArrayDeque;
import java.util.concurrent.ThreadLocalRandom;

class Main_multi1
{
	public static void main(String[] args)
	{
        ArrayDeque<Ship> ships = new ArrayDeque<>();
        for (int i = 0; i < 5; i++)
        {
        	int current = ThreadLocalRandom.current().nextInt(1, 50);
        	int max = ThreadLocalRandom.current().nextInt(current, 55);
        	
        	ships.add(new Ship(current, max));
        }

        Port p = new Port(50, 7, ships);
        p.work();
    }
}


