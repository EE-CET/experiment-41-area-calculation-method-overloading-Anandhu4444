import java.util.Scanner;

public class AreaCalculator {
   
    // Area of Circle
    float calculateArea(float radius){
        float pi = 3.14159f;
        return pi * radius * radius;
    }

    // Area of Rectangle
    float calculateArea(float length, float breadth){
        return length * breadth;
    }

    // Area of Triangle
    double calculateArea(double base, double height){
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float radius;
        float length;
        float breadth;
        double base;
        double height;

        // Input
        radius = sc.nextFloat();
        length = sc.nextFloat();
        breadth = sc.nextFloat();
        base = sc.nextDouble();
        height = sc.nextDouble();

        AreaCalculator area = new AreaCalculator();

        float Area1 = area.calculateArea(radius);
        float Area2 = area.calculateArea(length, breadth);
        double Area3 = area.calculateArea(base, height);

        // Output formatted to 2 decimal places
        System.out.printf("%.2f\n", Area1);
        System.out.printf("%.2f\n", Area2);
        System.out.printf("%.2f\n", Area3);

    }
}
