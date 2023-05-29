import java.util.ArrayList;
import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        ArrayList<String> arr = new ArrayList<String>();
        int n = in.nextInt();

        char first = in.next().charAt(0);
        char second = in.next().charAt(0);

        System.out.println("enter string");

        for (int i = 0; i < n ; i++) {
            arr.add(i,in.next());
            if (arr.get(i)==first) {
                
                
            }
        }

        System.out.println(arr);
    }
}
