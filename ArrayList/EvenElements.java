import java.util.ArrayList;
import java.util.Scanner;

public class EvenElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i<5; i++){
            list.add(i, in.nextInt());
        }

        for(int i=0; i<list.size(); i++){
            if(list.get(i)%2==0){
                list.remove(i);
                i--;
            }
        }

        System.out.println(list);
    }
}
