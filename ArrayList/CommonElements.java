import java.util.ArrayList;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();

        int n = in.nextInt();
        
        System.out.println("enter first array: ");
        for (int i = 0; i < n; i++) {
            arr1.add(i,in.nextInt());
        }

        System.out.println("enter Second array: ");
        for (int i = 0; i < n; i++) {
            arr2.add(i,in.nextInt());
        }
        
        int temp=0;
        for (int i = 0; i < arr1.size(); i++) {
            for(int j= 0; j < arr1.size(); j++){
                if (arr1.get(i)==arr2.get(j)) {
                    temp = arr1.get(i);
                    System.out.print(temp+" ");
                }
            }
        }
    }
}
