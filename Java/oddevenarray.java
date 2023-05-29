import java.util.Scanner;

public class oddevenarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = i+1;
        
        }

        int[] odd = new int[n/2];
        int[] even = new int[n/2];

        for (int i = 0; i < n; i++) {
            
            if(arr[i]%2==0){
                even[i] = arr[i];
            }
            else{
                odd[i] = arr[i];
            }

        }
        
        for (int i = 0; i < even.length; i++) {
            System.out.println(even[i]);
        }
    }
}
