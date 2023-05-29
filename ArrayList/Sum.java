import java.util.ArrayList;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(i,in.nextInt());
        }

        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        

        System.out.println(sum);
    }
}
