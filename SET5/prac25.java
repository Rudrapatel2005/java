public class prac25  {
    public static void main(String[] args) {
        try {
            int[] numbers = { 1, 2, 3, 4, 5 };
            
            System.out.println(numbers[5]); 

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds!");
            System.out.println("Exception Message: " + e.getMessage());
        }
    }
}