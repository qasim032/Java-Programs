public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to alphabet printer");
        for (int i = 97; i <= 122; i++) {

            int alpha = i;
            System.out.print(" " + (char) alpha);

        }
        System.out.println();
        for (int j = 65; j <= 90; j++) {
            int a = j;
            System.out.print(" "+(char) a);
        }

    }
}