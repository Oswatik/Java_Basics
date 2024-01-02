// ArrayList

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // adding elements (.add(element))
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        System.out.println(list);

        // getting elements (.get(index))
        int target = list.get(1);
        System.out.println(target);

        // add element in between (.add(target index, new element))
        list.add(2,9);
        System.out.println(list);

        // set element- change the existing element
        list.set(2, 3);
        System.out.println(list);

        // remove element
        list.remove(3);
        System.out.println(list);

        // finding size of an array
        int size = list.size();
        System.out.println(size);

        // sorting of arraylist. import java.util.collections package
        Collections.sort(list);
        System.out.println(list);

        // Iterating through arraylist
        for (int i = 0; i<size; i++) {
            System.out.println(list.get(i));
        }

    }

}