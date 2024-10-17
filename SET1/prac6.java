import java.util.*;

public class prac6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, t1 = 0, t2 = 1;
        System.out.println("enter the number of days (n) for you want to generate their exercise routine.");
        n = sc.nextInt();
        for (int i = 1; i <= n; ++i) {
            System.out.print(t1 + ",");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        System.out.println("");
        System.out.println("23DCS088 RUDRA A. PATEL");
    }

}
