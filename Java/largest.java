import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter first no: ");
        int a = in.nextInt();

        System.out.print("enter second no: ");
        int b = in.nextInt();

        System.out.print("enter third no: ");
        int c = in.nextInt();

        int max=a;

        if (b>max) {
            max=b;
        }

        if (c>max) {
            max=c;
        }

        System.out.println(max);

    }
}
