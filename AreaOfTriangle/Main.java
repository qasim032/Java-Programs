import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base of triangle :");
        float base = input.nextFloat();
        System.out.print("Please Enter the height of triangle :");
        float height = input.nextFloat();
        float areaOfTriangle = 1.0f/2*(base*height);
        System.out.print("The area of Triangle is :"+areaOfTriangle);
    }
}