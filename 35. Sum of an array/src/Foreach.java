import java.util.Scanner;

public class Foreach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];

        for (int i = 0; i < array.length;i++) {

            array[i] = input.nextInt();

        }
    }
}
