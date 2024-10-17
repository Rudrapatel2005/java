import java.util.*;

public class prac4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int sum = 0;
        int[] arr = new int[30];
        for (i = 0; i < 30; i++) {
            System.out.print("day ");
            System.out.print(i + 1);
            System.out.print(" expense is: ");
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("total expenses : " + sum);
        System.out.println("23DCS088 RUDRA A. PATEL");
    }
}
