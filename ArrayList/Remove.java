import java.util.ArrayList;
import java.util.Scanner;

public class Remove {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<Integer>();
        int n = in.nextInt();
        int x = in.nextInt();

        System.out.println("Enter array: ");

        for (int i = 0; i < n; i++) {
            arr.add(i,in.nextInt());
        }

        for (int i= 0; i < arr.size(); i++) {
            if (arr.get(i)==x) {
                arr.remove(i);
            }
        }

        System.out.println(arr);

    }
}
