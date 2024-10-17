import java.util.*;

public class prac5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] prices = { 100.0f, 200.0f, 300.0f, 400.0f, 0.0f };
        String[] products = { "Motor", "Fan", "Tube", "Wires", "" };

        System.out.println("code 1 to motor");
        System.out.println("code 2 to fan");
        System.out.println("code 3 to tube");
        System.out.println("code 4 to wires.");
        System.out.println("code 5 to All other items");

        System.out.print("Enter product code: ");
        int productCode = sc.nextInt();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double totalPrice = prices[productCode] * quantity;

        switch (productCode) {
            case 1:
                totalPrice = totalPrice + (totalPrice * 0.08);
                break;
            case 2:
                totalPrice = totalPrice + (totalPrice * 0.12);
                break;
            case 3:
                totalPrice = totalPrice + (totalPrice * 0.05);
                break;
            case 4:
                totalPrice = totalPrice + (totalPrice * 0.075);
                break;
            default:
                totalPrice = totalPrice + (totalPrice * 0.03);
        }
        System.out.println("Product: " + products[productCode]);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + totalPrice);
        System.out.println("23DCS088 RUDRA A. PATEL");
    }
}
