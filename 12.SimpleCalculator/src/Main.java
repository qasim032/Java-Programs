import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\nWelcome to our Calculator \n");
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your first number:");
        int num1 = input.nextInt();
        System.out.println("Please Enter your second number:");
        int num2 = input.nextInt();
        System.out.println("The sum of two numbers is :"+(num1+num2));
        System.out.println("The difference of two numbers is :"+(num1-num2));
        System.out.println("The division of two numbers is :"+((float)num1/num2));
        System.out.println("The remainder of two numbers is :"+(num1%num2));




    }
}