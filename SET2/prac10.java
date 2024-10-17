import java.util.*;

public class prac10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        int length = str.length();
        System.out.println("Length of a String is :" + length);
        String lower = str.toLowerCase();
        System.out.println("Lower case of String is :" + lower);
        String upper = str.toUpperCase();
        System.out.println("Upper case of String is :" + upper);
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Reverse String is :" + reverse);
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);
        System.out.println("Sorted string: " + sortedString);
        System.out.println("23DCS088 RUDRA A. PATEL");
    }
}
