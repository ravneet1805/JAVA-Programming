import java.util.*;

public class ArrlistIntro{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add elements

        list.add(0);
        list.add(8);
        list.add(6);
        list.add(5);

        System.out.println(list);

        //get elements

        int x = list.get(1);   //here 1 is index 
        System.out.println(x);


        //add elements in between

        list.add(2, 9);  //here 9 is added at 2nd index
        System.out.println(list);


        //set element (change element at an index)
        list.set(3, 4);
        System.out.println(list);


        //delete element

        list.remove(1);    //here element at index 1 is removed
        System.out.println(list);

        //size of ArrayList

        System.out.println(list.size());


        //Loops

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        




    }
}
