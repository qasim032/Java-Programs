import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("\nWelcome to number checking calculator\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number:");
        int num = input.nextInt();
        if(num>=1){
            System.out.println("The number "+num+" is positive");
        }
        else if (num == 0){
            System.out.println("The number is zero");
        }
        else {
            System.out.println("The number "+num+" is negative");
        }

    }
}