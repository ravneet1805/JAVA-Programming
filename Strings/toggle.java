import java.util.*;
public class toggle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		
		StringBuilder str = new StringBuilder(in.nextLine());
		
		for(int i = 0; i<str.length(); i++){
		    
		    char c = str.charAt(i);
		    int asci = (int)c;

            if(c==' '){
                continue;
            }
		    
		    if(asci>97){
		        asci = asci-32;
		        c = (char)asci;
		        System.out.print(c);
		    }
		    else{
		        asci = asci+32;
		        c= (char)asci;
		        System.out.print(c);
		    }
		}
    }
}
