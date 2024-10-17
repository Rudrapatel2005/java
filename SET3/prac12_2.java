import java.util.*;

public class prac12_2 {

    public static void curency(float pound) {
        float rupees = pound * 100;
        System.out.println("rupees :" + rupees);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        prac12_2.curency(1000);
    }
}
