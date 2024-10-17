import java.util.*;

public class prac16 {
     public static void main(String[] args) {
        
            Complex c1 = new Complex(3, 5);
            Complex c2 = new Complex(7, 9);
            System.out.print("Sum: ");
            c1.add(c2);
            System.out.print("Difference: ");
            c1.subtract(c2);
            System.out.print("Product: ");
            c1.multiply(c2);
     }
}
class Complex{
    int real, imaginary;
    Complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    void add(Complex c){
        System.out.println((this.real+c.real)+" + "+(this.imaginary+c.imaginary)+"i");
    }
    void subtract(Complex c){
        System.out.println((this.real-c.real)+" + "+(this.imaginary-c.imaginary)+"i");
    }
    void multiply(Complex c){
        System.out.println((this.real*c.real - this.imaginary*c.imaginary)+" + "+(this.real*c.imaginary + this.imaginary*c.real)+"i");
    }
}
