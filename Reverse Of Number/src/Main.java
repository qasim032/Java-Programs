import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nWelcome to reverse number calculator\n");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number ");
        int num = input.nextInt();
        System.out.println("The reverse of your number is "+reverseNum(num));


    }

    public static int reverseNum(int num) {
        int newNum = 0;

        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;

        }


        return newNum;


    }
}