import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nWelcome to swapping program\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your first number: ");
        int a = input.nextInt();
        System.out.print("Now, enter your second number: ");
        int b = input.nextInt();
        System.out.println("Before swapping the value is\n a = "+a+"\n b = "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping the value is\n a = "+a+"\n b = "+b);

    }
}