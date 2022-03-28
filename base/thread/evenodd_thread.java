package base.thread;

class eventhread implements Runnable {
    Thread t;
    eventhread(String name) {
        t = new Thread(this, name);
        t.start();
    }

    public void run(){
        for(int i = 2; i<= 10 ; i+=2){
            try {
                System.out.println("even: "+ i);
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class oddthread implements Runnable {
    Thread t;
    oddthread(String s) {
        t = new Thread(this, s);
        t.start();
    }

    public void run(){
        for(int i = 1; i<= 10 ; i+=2){
            try {
                System.out.println("odd: "+ i);
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class evenodd_thread {
    public static void main(String[] args) throws InterruptedException {
        eventhread e = new eventhread("even");
        oddthread o = new oddthread("odd");
        
        Thread a = new Thread(e);
        Thread b = new Thread(o);

        a.start();
        b.start();
    }
}
