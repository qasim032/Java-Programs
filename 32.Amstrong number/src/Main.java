import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nArmstrong number checker\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = input.nextInt();


        int digit = digit(num);
        int armstrong = armstrong(num, digit);


        if (num == armstrong) {
            System.out.println("Your number is armstrong number ");
        } else
            System.out.println("Your number is not a armstrong number ");


    }

    public static int digit(int num) {
        int digit = 0;
        while (num != 0) {
            num = num / 10;
            digit++;

        }
        return digit;


    }

    public static int armstrong(int num, int digit) {
        int mul = 1;
        int add = 0;

        for (int i = 1; num != 0; i++) {

            mul = 1;
            int a = num % 10;
            for (int j = 1; j <= digit; j++) {
                mul = mul * a;

            }
            add = add + mul;
            num /= 10;

        }
        return add;
    }
}