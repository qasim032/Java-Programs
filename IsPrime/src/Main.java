import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to prime number checker\n ");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number ");
        int num = input.nextInt();


        if (isPrime(num)) {
            System.out.println("Your number is a prime number ");
        } else {
            System.out.println("Your number is not a prime number");
        }

    }

    public static boolean isPrime(int num) {

        int i;
        if (num < 2) {
            return false;
        }
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}