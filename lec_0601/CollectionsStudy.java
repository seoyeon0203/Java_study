package lec_0601;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsStudy {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(9); arr.add(7); arr.add(5); arr.add(3); arr.add(1);

        Collections.sort(arr);
        System.out.println(arr);

        Collections.reverse(arr);
        System.out.println(arr);

        Collections.shuffle(arr);
        System.out.println(arr);

        Integer index1 = Collections.binarySearch(arr, 3);
        Integer index2 = Collections.binarySearch(arr, 5);
        System.out.println(index1);
        System.out.println(index2);
        
    }
}
