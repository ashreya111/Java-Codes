public class Deadlock {
    public static void main(String[] args) {
        final String r1 = "shreya";
        final String r2 = "agarwal";
        Thread t1 = new Thread(){
        public void run ()
        {
            synchronized (r1) {
                System.out.println("Thread 1: locked resource 1");

                try {
                    Thread.sleep(100);
                } catch (Exception e) {

                }

                synchronized (r2) {
                    System.out.println("Thread 1: locked resource 2");
                }
            }
            }
        };
Thread t2 = new Thread()
{
    public void run()
    {
        synchronized (r2)
        {
            System.out.println("Thread 2: locked resource 2");

            try {
                Thread.sleep(100);
            }
            catch (Exception e)
            {

            }

            synchronized (r1)
            {
                System.out.println("Thread 2: locked resource 1");
            }
        }
    }
};
t1.start();
t2.start();
}
}
