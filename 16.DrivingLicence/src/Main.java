import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nWelcome to Driving Licence Portal\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your age :");
        int age = input.nextInt();
        if(age >= 18){
            System.out.println("You are eligible to drive");
        }
        else {
            System.out.println("You are not eligible to drive");
        }
    }
}