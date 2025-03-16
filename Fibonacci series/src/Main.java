import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nFibonacci series \n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number ");
        int num = input.nextInt();
        System.out.print("The fibonacci series is : ");
        fibonacci(num);

    }

    public static void fibonacci(int num) {
        if (num < 0) return;
        System.out.print("0 ");
        if (num == 0) return;
        System.out.print("1 ");
        int first = 0, second = 1;
        while (first + second <= num) {
            int third = first + second;
            System.out.print(third + " ");
            first = second ;
            second = third;


        }

    }
}