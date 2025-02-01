import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class uuu {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        System.out.println(list);


        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }


        int i = 0;
         while(i<list.size()){
             System.out.println(list.get(i));
             i++;
         }


         for(Integer j: list){
             System.out.println(j);
         }


    }
}
