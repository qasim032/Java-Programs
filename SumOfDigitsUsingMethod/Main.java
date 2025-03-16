import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nWelcome to sum of digits \n ");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number ");
        int num = input.nextInt();
        System.out.println(sumOfDigits(num));

    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        for (int i = 0;num>i;) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}