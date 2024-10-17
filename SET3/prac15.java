import java.util.*;

public class prac15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l, b;
        System.out.print("Enter Length :");
        l = sc.nextInt();
        System.out.print("Enter Breath :");
        b = sc.nextInt();
        Area AR = new Area(l, b);
        System.out.print("Area of rectangle :");
        int a = AR.returnvalue();
        System.out.println(a);
        System.out.println("23DCS088 RUDRA PATEL");
    }
}

class Area {
    int length;
    int breath;

    Area(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    int returnvalue() {
        return this.length * this.breath;
    }
}
