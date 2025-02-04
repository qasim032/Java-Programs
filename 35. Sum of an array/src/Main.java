public class Main {
    public static void main(String[] args) {
        System.out.println("\nWelcome to sum of an array \n");

        int[] a = Arrayutility.inputarray();
        long sum = sum(a);
        System.out.println("Sum of the numbers is "+sum);
        float average = average((int)sum,a.length);
        System.out.println("The average of the numbers is "+average);
    }

        public static long sum(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++){
            sum = sum + num[i];
        }
        return sum;
    }
    public static float average(int sum,int length){
        float average = (float)sum/length;
        return average;
    }

    }