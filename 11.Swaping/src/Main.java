import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter First Number For Swap:");
        int a = Input.nextInt();
        System.out.print("Please Enter Second number For Swap:");
        int b = Input.nextInt();
        System.out.println("Before Swaping a = "+a+" b = "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swaping a = "+a+" b = "+b);


    }
}