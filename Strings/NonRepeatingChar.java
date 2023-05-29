import java.util.*;

public class NonRepeatingChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            
            for (int j = i + 1; j < str.length(); j++) {

                
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }

            }

            if (count == 0) {
                System.out.println(str.charAt(i));
                break;
            }

            count = 0;

        }

    }
}
