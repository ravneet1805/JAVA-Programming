import java.util.*;

public class CharCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		
		String ans = ""+ str.charAt(0);
		
		int count = 1;
		
		for(int i=1; i<str.length(); i++){
		    char present = str.charAt(i);
		    char previous = str.charAt(i-1);
		    
		    if (present == previous){
		        count++;
		    }
		    else{
		        ans = ans+count;
		        
		        ans = ans+ str.charAt(i);
		        
		        count=1;
		    }  
		    
		    
		}
		
		ans=ans+ count;
		System.out.println(ans);
    }
}
