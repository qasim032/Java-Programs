import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to LCM calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number ");
        int num1 = input.nextInt();
        System.out.print("Now, enter your second number ");
        int num2 = input.nextInt();
        System.out.print("The LCM of the numbers is : "+lcm(num1, num2));
    }

    public static int lcm(int num1, int num2) {
        int i = 1;
        while (true) {

            if (i % num1 == 0 && i % num2 == 0) {
                return i;
            }
            i++;

        }


    }
}