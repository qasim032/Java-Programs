import java.util.Scanner;

public class DeleteANumFromArray {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Welcome to deleting a num from an array \n\n");

        int[] array = ArrayUtility.inputArray();
        int num = num(array);
        int occurences = numOfOccurences(array,num);
        int[] updatedArray = updatedArray(array, num,occurences);
        System.out.println("The element is removed from an array ");
        for(int i = 0; i < updatedArray.length; i++){
            System.out.print(updatedArray[i]+" ");
        }

    }

    public static int num(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nPlease enter a number you want to delete ");
        int num = input.nextInt();

        return num;

    }
    public static int numOfOccurences(int[]array,int num){
        int occurences = 0;
        for (int i = 0; i< array.length;i++){
            if (num!=array[i]){
                occurences++;
            }
        }
        return occurences;


    }

    public static int[] updatedArray(int[] array, int num,int occurences) {
        int[] updatedArray = new int[occurences];
        int j  = 0;
        for (int i = 0; i < array.length ; i++) {
            if (num != array[i]) {
                updatedArray[j] = array[i];
                j++;
            }


            

        }


        return updatedArray;

    }

}


