import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num1 = Input.nextInt();
        System.out.print("Enter a number:");
        int num2 = Input.nextInt();
        System.out.print("The sum is :");
        int sum = num1+num2;
        System.out.println(sum);

    }
}