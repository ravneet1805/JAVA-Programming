import java.util.*;
public class ReverseInSentence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		
		String ans = "";
		
		StringBuilder s = new StringBuilder("");
		
		for(int i=0; i<str.length(); i++){
		    
		    char x = str.charAt(i);
		    
		    if(x!=' '){
		        s.append(x);
		    }
		    else{
		        s.reverse();
		        ans += s;
		        ans+=" ";
		        
		        s = new StringBuilder("");
		    }
		    
		}
		s.reverse();
		ans+=s;
		System.out.println(ans);
    }
}
