import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number :");
        int num = input.nextInt();
        int sum = sumOdd(num);
        System.out.println("Odd sum till "+num+" is "+sum);

    }

    public static int sumOdd(int num) {

        int sum = 0;
        for (int i = 1; i <= num; i+=2) {

            sum = sum + i;

        }
        return sum;

    }
}