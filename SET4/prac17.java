import java.util.*;
class Parent {

    void displayParent() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {

    void displayChild() {
        System.out.println("This is child class");
    }
}

public class prac17 {
    public static void main(String[] args) {

        Parent parentObj = new Parent();
        parentObj.displayParent();

        Child childObj = new Child();
        childObj.displayChild();
        childObj.displayParent();
    }
}
