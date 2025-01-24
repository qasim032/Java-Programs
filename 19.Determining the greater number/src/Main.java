import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nWelcome to greater number guessing calculator\n\n ");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();
        System.out.print("Now,enter the third number: ");
        int c = input.nextInt();
        if (a >= b && a >= c) {
            System.out.println("The greater number is " + a);
        } else if (b >= a && b >= c) {
            System.out.println("The greater number is " + b);
        } else {
            System.out.println("The greater number is " + c);
        }


    }
}