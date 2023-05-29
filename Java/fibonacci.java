import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter a number: ");

        int n = in.nextInt();

        int a=0;
        int b=1;
        int c= a+b;

        for(int i=0; i<n-2; i++){
            a=b;
            b=c;
            c=a+b;

        }
        System.out.println(c);
    }
}
