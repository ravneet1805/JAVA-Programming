import java.util.*;

public class Printsubstrings {
    public static void main(String[] args) {
        
    
    Scanner in = new Scanner(System.in);

    String str = in.nextLine();

    for(int i = 0; i<=str.length(); i++){
        for (int j = i+1; j <= str.length(); j++) {
            
            System.out.print(str.substring(i,j));
            System.out.print(" ");
        }
    }
    }
}
