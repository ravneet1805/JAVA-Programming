import java.util.LinkedList;
import java.util.Scanner;

public class CheckLL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        System.out.println("Enter element to Search: ");
        int x = in.nextInt();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)==x) {
                System.out.println(x+" is present at index "+ i);
                break;
            }
        }
    }
}
