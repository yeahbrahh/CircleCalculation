// Your task is to write a program that will read in the radius of a circle,
// and print out the diameter, circumference and area.

//Your program should use a separate function for doing each calculation,
// and should use parameters and return values to pass information back and forth.


import java.util.Scanner;// import Scanner class
public class Main {
    static Scanner sc = new Scanner(System.in);// assign Scanner

    //Calculate Diameter
    static double diameter(double radius) {
        return radius * 2;
    }
// Calculate Area
    static double area(double radius) {
        return Math.PI * (radius * radius);
    }
//Calculate Circumference
    static double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

    //Prompts User for Input
    static double input() {
        System.out.println("\nPlease enter radius: ");//Prompt
        return sc.nextDouble();// User input
    }

    //Reassigns Functions to local variables
    // Passes radius into scope
    //Outputs Values 2 places past the decimal
    static void output(double radius) {
        double d = diameter(radius);
        double a = area(radius);
        double c = circumference(radius);


        System.out.println("Your diameter is: " + d + ".");
        System.out.printf("Your area is: %.2f", a);
        System.out.printf("\nYour circumference is: %.2f\n", c);
    }
//Main Method
    //Do- While Loop to Keep Calling User Prompt and Outputting Values

    public static void main(String[] args) {
        do {
            double radius = input();
            output(radius);
        } while (true);

    }
}