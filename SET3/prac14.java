import java.util.*;

public class prac14 {
    public static void main(String[] args) {
        data d1 = new data(0, 0, 0);
        d1.get();
        d1.display();
        System.out.println("23DCS088 RUDRA PATEL");
    }
}

class data {
    int day;
    int month;
    int year;

    data(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    public void get() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Day :");
        day = sc.nextInt();
        System.out.print("Enter a Month :");
        month = sc.nextInt();
        System.out.print("Enter a Year :");
        year = sc.nextInt();
    }

    public void display() {
        System.out.println("DATE :" + day + "/" + month + "/" + year);
    }
}
