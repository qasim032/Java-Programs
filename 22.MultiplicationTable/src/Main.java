import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int table = input.nextInt();
        System.out.println("\nThe table of " + table + " is \n");
        int num = 1;
        while (num <= 10) {
            System.out.println(table + " X " + num + " = " + (table * num));
            num++;
        }
    }
}