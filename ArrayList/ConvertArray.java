import java.util.ArrayList;
import java.util.Scanner;

public class ConvertArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            list.add(i, in.nextInt());
        }

        for(int i = 0; i<n; i++){
            arr[i]=list.get(i);
        }

        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index]+" ");
        }
    }
}
