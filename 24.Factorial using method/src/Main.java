import java.io.Serializable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nWelcome to factorial calculator\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number ");
        int num = input.nextInt();
        System.out.print(factorial(num));
    }

    public static Serializable factorial(int num) {
        if (num < 0) {
            String a ="The factorial of the number is undefined." ;
            return a;
        } else{
            int factorial = 1;

        for (int i = 1; i <= num; i++) factorial = i * factorial;

        System.out.print("\nThe factorial of the number is : ");

        return factorial;}

    }
}