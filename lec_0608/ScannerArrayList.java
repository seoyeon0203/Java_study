package lec_0608;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class ScannerArrayList {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        ArrayList<String> colors = new ArrayList<String>();

        for(int i=0; i < 3; i++){
            System.out.println("> ");
            colors.add(sc.nextLine());
            System.out.println();

        }

        for(String color : colors ) System.out.println(color);

    }



}
