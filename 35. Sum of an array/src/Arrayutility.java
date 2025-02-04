import java.util.Scanner;

public class Arrayutility {
    public static int[] inputarray() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a size of an array : ");
        int sizeOfArray = input.nextInt();
        int[] array1 = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print("Please enter element no " + (i + 1) + " : ");
            array1[i] = input.nextInt();
        }
    return array1;
    }

}
