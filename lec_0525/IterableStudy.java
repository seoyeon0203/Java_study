package lec_0525;

import java.util.Iterator;

class Range implements Iterable<Integer>{
    private int start;
    private int end;
    public Range(int start, int end){
        this.start = start;
        this.end = end;
    }
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int current = start;
            @Override
            public boolean hasNext() {
                return !(current > end);
            }

            @Override
            public Integer next() {
                int returnlValue = current;
                current++;
                return returnlValue;
            }
        };
    }
}
public class IterableStudy {
    public static void main(String[] args){
        Range range = new Range(1, 10);
        for(Integer num : range){
            System.out.println(num);    // print 1~ 10
        }

    }
}
