public class prac36 {
    public static void main(String[] args) {
        Thread first = new Thread(new Runnable() {
            public void run() {
                System.out.println(Thread.currentThread().getName() + " Priority: " + Thread.currentThread().getPriority());
            }
        });
        
        Thread second = new Thread(new Runnable() {
            public void run() {
                System.out.println(Thread.currentThread().getName() + " Priority: " + Thread.currentThread().getPriority());
            }
        });
        
        Thread third = new Thread(new Runnable() {
            public void run() {
                System.out.println(Thread.currentThread().getName() + " Priority: " + Thread.currentThread().getPriority());
            }
        });

        first.setPriority(3);
        second.setPriority(5); 
        third.setPriority(7);

        first.setName("FIRST");
        second.setName("SECOND");
        third.setName("THIRD");

        first.start();
        second.start();
        third.start();
    }
}