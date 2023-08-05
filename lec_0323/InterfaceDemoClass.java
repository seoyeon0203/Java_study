package lec_0323;

import java.util.Iterator;

class FruitsIterable implements Iterable<String>{

    @Override
    public Iterator<String> iterator() {
        String[] fruits = {"apple", "banana", "orange"};

        return new Iterator<String>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return fruits.length > currentIndex;
            }

            @Override
            public String next() {
                String ret = fruits[currentIndex];
                currentIndex++;
                return ret;
            }
        };
    }
}

class IntRange implements Iterable<Integer>{

    private int start, end;

    public IntRange(int start, int end){
        this.start = start;
        this.end = end;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return start <= end;
            }

            @Override
            public Integer next() {
                return start++;
            }
        };
    }
}
public class InterfaceDemoClass {
    public static void main(String[] args){
        FruitsIterable iterable = new FruitsIterable();
        for(String s : iterable){
            System.out.println(s);
        }

        IntRange intRange = new IntRange(1, 10);
        for(Integer i : intRange){
            System.out.println(i);
        }


    }

}
