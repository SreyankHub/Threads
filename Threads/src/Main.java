public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread.currentThread().setName("MAIN");                 //To Set The Name Of The Thread
        System.out.println(Thread.currentThread().getName());       //To Show The Name Of The Thread
        Thread.currentThread().setPriority(9);                      //To Set Priority of the Thread
        System.out.println(Thread.currentThread().getPriority());   //To Get The Priority Of Thread
        System.out.println(Thread.activeCount());                   //To Get The Number of threads Running
        System.out.println(Thread.currentThread().isDaemon());      //To Check If A Thread is Daemon Thread or not

        MyThread MyThread = new MyThread();                         //New My Thread Class Object

        MyThread.start();                                           //To Start A class (which extends Thread)

        if(Thread.currentThread().isAlive()) {                      //To check if a thread is alive(Running)
            System.out.println(Thread.currentThread().getName()+" is Running!");
        }


        for(int x=10;x>0;x--) {
            System.out.println(x+" Seconds");
            Thread.sleep(1000);                               //To Stop The Program For Some Time
        }

        System.out.println("Done!");

    }
}
