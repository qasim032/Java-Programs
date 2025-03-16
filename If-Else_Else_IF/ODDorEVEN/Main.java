import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to even odd calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.print("Your number is even ");
        } else {
            System.out.print("Your number is odd ");
        }
    }
}