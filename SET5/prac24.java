import java.util.Scanner;

public class prac24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the value of X :");
            int x = sc.nextInt();
            System.out.print("Enter the value of Y :");
            int y = sc.nextInt();

            int result = x / y;
            System.out.println("Result : " + result);
        } catch (Exception e) {
            if (e instanceof ArithmeticException) {
                System.out.println("Error: Divison by 0 is not possible.");
            } else {
                System.out.println("Please Enter valid integer.");
            }
        }
    }
}