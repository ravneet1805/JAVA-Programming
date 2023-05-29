

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        func(a,b);


    }

    static void func(int a, int b){

        int temp;

        temp = a;
        a = b;
        b = temp;
        
        System.out.println(a+" "+b);
    }
}
