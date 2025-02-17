import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Array Sorting check post \n");
        int[] array = ArrayUtility.inputArray();
        boolean dec = isDec(array);
        boolean asc = isAsc(array);
        if (asc) {
            System.out.println("Your Array is sorted in ascending order ");
        }
        else if (dec){
            System.out.println("Your Array is sorted in descending order ");
        }else{
            System.out.println("Your Array is not sorted ");
        }
    }

    public static boolean isAsc(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] < array[i]) {
                return false;
            }
        }
        return true;

    }

    public static boolean isDec(int[] array) {
        for (int i = 1; i < array.length ; i++) {
            if (array[i - 1] > array[i]) {
                return false;
            }
        }

        return true;
    }
}