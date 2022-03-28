package base.thread;

class threadbasesetup extends Thread {
    threadbasesetup(String s) {
        super(s);
    }

    public void run() {
        try {
            for(int i = 1; i <= 3; i++){
                System.out.println(Thread.currentThread().getName() + ": Hello");
                sleep(300);
                
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class threadbase {
    public static void main(String[] args) throws InterruptedException {
        threadbasesetup t1 = new threadbasesetup("Thread 1");
        threadbasesetup t2 = new threadbasesetup("Thread 2");
        threadbasesetup t3 = new threadbasesetup("Thread 3");
        t1.start();
        t2.start();
        t3.start();
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Main thread: Hello");
    }   
}
