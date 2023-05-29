import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int x=n;
        int sum = 0;

        while (x!=0) {
            int rem= x%10;
            rem = rem*rem*rem;

            sum = sum+rem;

            x = x/10;
        }
        
        if (sum==n) {
            System.out.println(n+" is an Armstrong Number");
        }
        else{
            System.out.println(n+" is not an Armstrong number");
        }

    }
}