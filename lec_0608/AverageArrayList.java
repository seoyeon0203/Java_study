package lec_0608;

import java.util.ArrayList;

public class AverageArrayList {
    public static void main(String[] args){

        ArrayList<Double> scores = new ArrayList<Double>();

        double sum =0;

        scores.add(90.0);
        scores.add(85.0);
        scores.add(100.0);

        for(Double d : scores){
            sum += d;
            System.out.println(sum/scores.size());
        }
    }
}
