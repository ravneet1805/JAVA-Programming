import java.util.ArrayList;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        
        ArrayList<Integer> list = new ArrayList<Integer>();

        int n = in.nextInt();
        for(int i = 0 ; i < n; i++){
            list.add(i, in.nextInt());
        }

        int count = 0;

        for(int i = 0; i<list.size(); i++){
            for(int j = i; j<list.size(); j++){
                if(list.get(i)==list.get(j)){
                    count++;
                    if(j>i){
                        list.remove(j);
                    }
                    
                }
                
            }
            System.out.println("Frequency of "+list.get(i)+" is: "+count);
            count=0;
        }

    }
}
