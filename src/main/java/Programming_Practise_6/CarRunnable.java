package Programming_Practise_6;

public class CarRunnable {

    private class RunnableImpl implements Runnable {

        public void run()
        {
            System.out.println(Thread.currentThread().getName()
                    + ", executing run() method!");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Main thread is- "
                + Thread.currentThread().getName());
        Thread t1 = new Thread(new CarRunnable().new RunnableImpl());
        t1.start();
    }

}