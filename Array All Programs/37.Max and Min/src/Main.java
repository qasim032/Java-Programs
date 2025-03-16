import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to max and min finder ");
        int[] array = inputArray();
        int max = max(array);
        System.out.println("The maximum value in the array is " + max);
        int min = min(array);
        System.out.println("The minimum value in the array is " + min);


    }


    public static int[] inputArray() {
        System.out.print("Please enter the size of an array ");
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a value for " + (i + 1) + " no element: ");
            array[i] = input.nextInt();
        }
        return array;

    }


    public static int max(int[] array) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        return max;
    }

    public static int min(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }


        return min;
    }

}