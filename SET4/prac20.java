class Shape {
    public void printShape() {
        System.out.println("This is a shape.");
    }
}

class Rectangle extends Shape {
    public void printRectangle() {
        System.out.println("This is a rectangular shape.");
    }
}

class Circle extends Shape {
    public void printCircle() {
        System.out.println("This is a circular shape.");
    }
}

class Square extends Rectangle {
    public void printSquare() {
        System.out.println("Square is a rectangle.");
    }
}

public class prac20 {
    public static void main(String[] args) {
        Square mySquare = new Square();
        mySquare.printShape();    
        mySquare.printRectangle(); 
    }
}
