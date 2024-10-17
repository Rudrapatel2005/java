import java.util.*;

public class prac12_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pound;
        System.out.print("Enter Pound :");
        pound = Integer.parseInt(args[0]);
        float rupees;
        rupees = pound * 100;
        System.out.println("rupees :" + rupees);
    }
}
