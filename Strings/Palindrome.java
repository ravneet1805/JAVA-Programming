import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        
        StringBuilder z = new StringBuilder(str);

        String y = z.reverse() + "";
        if (str.equals(y)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
