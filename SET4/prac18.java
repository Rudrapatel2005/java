import java.util.*;

public class prac18 {
    public static void main(String[] args) {
        Employee E = new Employee();
        E.name = "Samarth Patel";
        E.age = 18;
        E.mobile_number = 1551558625;
        E.Address = "maheshana,India";
        E.Salary = 50000;
        E.Specialization = "Software Development";

        Manager M = new Manager();
        M.name = "Rudra Patel";
        M.age = 18;
        M.mobile_number = 1551558625;
        M.Address = "Surat,India";
        M.Salary = 50000;
        M.Department = "Software Development";

        System.out.println("____________________________");
        E.displayEmployeeDetails();
        System.out.println("____________________________");
        M.displayManagerDetails();
    }

}

class Member {
    String name;
    int age;
    int mobile_number;
    String Address;
    double Salary;

    void printSalary() {
        System.out.println("Salary: " + Salary);
    }
}

class Employee extends Member {
    String Specialization;

    void displayEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + mobile_number);
        System.out.println("Address: " + Address);
        System.out.println("Specialization: " + Specialization);
        printSalary();
    }
}

class Manager extends Member {
    String Department;

    void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + mobile_number);
        System.out.println("Address: " + Address);
        System.out.println("Specialization: " + Department);
        printSalary();
    }
}
