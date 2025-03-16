import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit:");
        float fahrenheit = input.nextFloat();
        float celsius = (fahrenheit-32)*5.0f/9;
        System.out.print("The temperature in Celsius is "+celsius);
    }
}