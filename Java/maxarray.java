import java.util.Scanner;

public class maxarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("enter size of array:");
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            
            arr[i] = in.nextInt();
        }

        int max = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println("max no is:" + max);

    }
}
