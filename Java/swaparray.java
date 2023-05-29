import java.util.Scanner;

public class swaparray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i]= in.nextInt();
            
        }

        int x = 0;
        int y = arr.length-1;
        
        while(x<y){
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
            
            x++;
            y--;
        }

        System.out.print("swapped array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        
    }
}
