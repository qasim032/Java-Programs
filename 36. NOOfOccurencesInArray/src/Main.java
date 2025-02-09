import java.util.Scanner;

public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to number of  occurrences of an element in an array.  ");
        int[] array = inputArray();

        System.out.print("Now enter a num you want to find :");
        int num = input.nextInt();

        int times = times(num, array);
        System.out.println("Your number found "+times+" times in the array .");
    }

    public static int times(int num,int[] array ) {
        int times = 0;
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]){
                times++;
            }

        }
        return times ;
    }


    public static int[] inputArray() {

        System.out.print("Please enter the size of an array : ");
        int sizeArr = input.nextInt();

        int[] array = new int[sizeArr];

        for (int i = 0; i < sizeArr; i++) {
            System.out.print("Please enter the element no " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        return array;
    }

}