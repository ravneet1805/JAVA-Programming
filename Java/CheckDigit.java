import java.util.Scanner;

public class CheckDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter a number: ");

        int n = in.nextInt();
        int r,count=0;

        while (n!=0) {
            r=n%10;

            if (r==7) {
                count++;
            }
            
            n=n/10;
        }

        System.out.println(count);
    }
}
