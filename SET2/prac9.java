import javax.swing.*;
import java.util.*;

public class prac9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String str = sc.nextLine();
        System.out.println(double_char(str));
        System.out.println("23DCS088 RUDRA A. PATEL");
    }

    public static String double_char(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i);
            result += str.charAt(i);
        }
        return result;
    }
}
