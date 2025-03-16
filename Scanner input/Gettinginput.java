
import java.util.Scanner;

class Gettinginput {

    public static void main(String arguments[]) {
        String a;
        float b;
        String s;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name : ");
        s = in.nextLine();

        System.out.println("Enter your batch : ");
        a = in.nextLine();

        System.out.println("Enter your age : ");
        b = in.nextFloat();

       
        System.out.println("Your name is : " + s);
        System.out.println("Your batch is: " + a);
        System.out.println("Your age is : " + b);
    }
}
