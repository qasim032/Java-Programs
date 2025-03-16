import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first floating number:");
        float num1  = input.nextFloat();
        System.out.print("Please Enter Second floating number:");
        float num2  = input.nextFloat();
        System.out.println("The Product of the floating number is :"+(num1*num2));

    }
}