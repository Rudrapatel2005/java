import java.util.*;

public class prac7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word:");
        String str = sc.nextLine();
        int n;
        System.out.print("enter n:");
        n = sc.nextInt();
        if (str.length() < 3) {
            for (int i = 0; i < n; i++) {
                System.out.println(str);
            }
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print(str.substring(0, 3));
            }
        }
        System.out.println("");
        System.out.println("23DCS088 RUDRA A. PATEL");
        sc.close();
    }
}
