public class prac19 {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[2];
        rectangles[0] = new Rectangle(4, 11);
        rectangles[1] = new Square(6);

        for (Rectangle shape : rectangles) {
            System.out.println("Area: " + shape.area());
            System.out.println("Perimeter: " + shape.perimeter());
        }
    }
}

class Rectangle {
    int length;
    int breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    int area() {
        return length * breadth;
    }

    int perimeter() {
        return 2 * (length + breadth);
    }
}

class Square extends Rectangle {
    Square(int s) {
        super(s, s);
    }
}
