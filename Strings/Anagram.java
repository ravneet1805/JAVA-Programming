import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s1 = in.nextLine();
        String s2 = in.nextLine();

        char[] c1 = new char[s1.length()];
        char[] c2 = new char[s2.length()];

        c1 = s1.toCharArray();
        c2 = s2.toCharArray();

        if(s1.length()==s2.length()){
            Arrays.sort(c1);
            Arrays.sort(c2);

            for (int i = 0; i < c1.length; i++) {
                if (c1[i]==c2[i]) {
                    if (i==c1.length-1) {
                        System.out.println("it is Anagram");
                    }
                    
                }
                else{
                    System.out.println("it is not Anagram");
                    break;
                }
            }

            

        }
        else{
            System.out.println("it is not Anagram");
        }
        
    }
}
