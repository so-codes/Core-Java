package base.thread;

class threadex2 implements Runnable {
    
    Thread t;
    threadex2(String name) {
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        t.start();
    }

    public void run() {
        for(int i = 1; i <= 2; i++) {
            System.out.println("i = "+ i +"Thread name : " + Thread.currentThread().getName());
            try {
                System.out.println("Now "+ Thread.currentThread().getName() + " is sleeping");
                Thread.sleep(1000);
                System.out.println();
                System.out.println("Now "+ Thread.currentThread().getName() + " is awake");
                System.out.println();
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Finally" + Thread.currentThread().getName() + " is exiting");
        }
    }

    public static void main(String[] args) {
        threadex2 t1 = new threadex2("Thread 1");
        threadex2 t2 = new threadex2("Thread 2");
        threadex2 t3 = new threadex2("Thread 3");
        try {
            t1.t.join();
            t2.t.join();
            t3.t.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Main thread exiting");
    }
}