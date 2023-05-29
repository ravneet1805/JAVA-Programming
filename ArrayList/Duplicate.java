import java.util.ArrayList;
import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        // for (int i = 0; i < 5; i++) {
        //     list.add(i, in.nextInt());
        // }

        for (int i = 0; i < 5; i++) {
            int temp= in.nextInt();
            
            if (!list.contains(temp)) {

                list.add(temp);
                
            }
            
        }
        System.out.println(list);
    }
}
