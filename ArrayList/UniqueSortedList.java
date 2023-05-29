import java.util.*;

public class UniqueSortedList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            int temp = in.nextInt();
            
            if (!list.contains(temp)) {
                list.add(temp);  
            }

        }
        Collections.sort(list);

        System.out.println(list);
    }
}
