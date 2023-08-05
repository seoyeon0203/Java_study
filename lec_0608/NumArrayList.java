package lec_0608;

import java.util.ArrayList;

public class NumArrayList {
    public static void main(String[] args){
        ArrayList<Integer> list =  new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // 기본 for문
        for(int i=0; i < list.size();  i++){
            System.out.println(list.get(i));
        }

        // 향상된 for문
        for(Integer i : list) {
            System.out.println(i);
        }
    }



}
