public class prac35 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start(); 
    }
}

class Thread1 extends Thread {
    public void run() {
        int n = 0; 
        while (true) {
            n++; 
            System.out.println(n); 
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                 System.out.println("Thread interrupted."); 
            }
        }
    }
}