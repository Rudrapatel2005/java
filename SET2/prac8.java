import java.util.*;

public class prac8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the array size:");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The number of 9's in the array is:");
        System.out.println(array_count9(arr));
        System.out.println("23DCS088 RUDRA A. PATEL");
    }

    public static int array_count9(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 9) {
                count++;
            }
        }
        return count;
    }
}
