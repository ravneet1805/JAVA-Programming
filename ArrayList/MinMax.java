import java.util.ArrayList;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();

        int n = in.nextInt();

        for(int i = 0; i<n; i++){
            arr.add(i,in.nextInt());
        }

        int min = arr.get(0);
        int max = arr.get(0);

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)<min) {
                min = arr.get(i);
            }

            if(arr.get(i)>max){
                max = arr.get(i);
            }
            
        }

        System.out.println("MINIMUM: "+min);
        System.out.println("MAXIMUM: "+max);


    }
}
