import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nWelcome to number searching in an array \n\n");
        int[] arr = {3, 6, 8, 87, 65, 4, 68, 23, 9, 98, 34};

        System.out.print("Please enter the number you want to search in the array : ");
        int num = input.nextInt();
        boolean isFound = isFound(arr, num);
        if (isFound) {
            System.out.println("Your number was found in the array ");
        } else {
            System.out.println("Your number was not found in the array ");
        }

    }

    public static boolean isFound(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;

    }
}