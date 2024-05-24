// Demonstrate the Concept of Inter Thread Communication.

/*

public class Synchronization implements Runnable
{
    int tickets = 3;
    static int i = 1, j = 2, k = 3;
    public void booktickets(String name, int wantedtickets)
    {
        if(wantedtickets <= tickets)
        {
            System.out.println(wantedtickets+" tickets booked by "+name);
            tickets = tickets - wantedtickets;
        }
        else
        {
            System.out.println("No tickets to book.");
        }
    }
    public void run()
    {
        String name = Thread.currentThread().getName();
        if(name.equals("Prince Kumar."))
        {
            booktickets(name, i);
        }
        else if(name.equals("Shreya Hegdare."))
        {
            booktickets(name, j);
        }
        else
        {
            booktickets(name, k);
        }
    }
    public static void main(String alex[])
    {
        Synchronization s = new Synchronization();
        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);
        Thread t3 = new Thread(s);
        t1.setName("Prince Kumar.");
        t2.setName("Shreya Hegdare.");
        t3.setName("Prashant Patil.");
        t1.start();
        t2.start();
        t3.start();
    }
}

*/


// Demonstrate the Concept of Inter Thread Communication.

public class Synchronization implements Runnable
{
    int token = 1;
    public void run()
    {
        synchronized(this)
        {
            Thread t = Thread.currentThread();
            String name = t.getName();
            System.out.println(+token+" tickets..... alloted to "+name);
            token++;
        }
    }
    public static void main(String alex[])
    {
        Synchronization a1 = new Synchronization();
        Thread t1 = new Thread(a1);
        Thread t2 = new Thread(a1);
        Thread t3 = new Thread(a1);
        Thread t4 = new Thread(a1);
        t1.setName("Prince Kumar.");
        t2.setName("Pallavi Kumari.");
        t3.setName("Nandani Kumari.");
        t4.setName("Manohar A S.");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

