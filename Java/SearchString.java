import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        char x = in.next().trim().charAt(0);


        for (int i = 0; i < str.length(); i++) {
            if (x == str.charAt(i)) {
                System.out.println("character exists");
                break;
            }
            else if(i==str.length()-1){
                System.out.println("character does not exist");
            }
        }

        
    }
}
