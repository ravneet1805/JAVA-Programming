import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();
        
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(i, in.nextInt());
        }

        Collections.sort(list);

        System.out.println("Second Largest element: "+ list.get(n-2));


        
    }
}
