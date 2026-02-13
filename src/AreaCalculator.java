import java.util.Scanner;

public class AreaCalculator {
    
    // TODO: Define calculateArea(float radius) -> returns area of circle
    // Use Math.PI or 3.14159f for pi
    float calculateArea(float radius){
        float pi=3.14159f;
        return pi*radius*radius;
    }

    // TODO: Define calculateArea(float length, float breadth) -> returns area of rectangle
    float calculateArea(float length, float breadth){
        return length*breadth;
        
    }
    // TODO: Define calculateArea(double base, double height) -> returns area of triangle
    double calculateArea(double base, double height){
        return 0.5*base*height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float radius;
        float lenght;
        float breadth;
        double base;
        double height;
        // TODO: Read input for Circle (radius)
        // System.out.print("enter the value of raduis:");
        radius =sc.nextFloat();
        // TODO: Read input for Rectangle (length, breadth)
        // System.out.print("enter the value of length:");
        length =sc.nextFloat();
        // System.out.print("enter the value of breadth:");
        breadth =sc.nextFloat();
        // TODO: Read input for Triangle (base, height)
        // System.out.print("enter the value of base:");
        base =sc.nextFloat();
        // System.out.print("enter the value of height:");
        height =sc.nextFloat();
        AreaCalculator area= new AreaCalculator();
        float Area1=area.calculateArea(radius);
        float Area2=area.calculateArea(length, breadth);
        double Area3=area.calculateArea(base, height);
        // TODO: Call methods and print results formatted to 2 decimal places
        // Hint: Use System.out.printf("%.2f\n", area);
        System.out.printf("%.2f\n", Area1);
        System.out.printf("%.2f\n", Area2);
        System.out.printf("%.2f\n", Area3);
    }
}
