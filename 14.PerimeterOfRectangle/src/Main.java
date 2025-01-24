import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Length of rectangle : ");
        float length = input.nextFloat();
        System.out.print("Enter the Width of rectangle : ");
        float width = input.nextFloat();
        float perimeter = 2*(length+width);
        System.out.print("The Perimeter of rectangle is : "+perimeter);

    }
}