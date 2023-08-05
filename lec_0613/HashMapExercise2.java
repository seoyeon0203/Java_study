package lec_0613;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class HashMapExercise2 {
    public  void main(String [] args){
        HashMap<String ,Person> map = new HashMap<String, Person>();

        map.put("010-1234-5678", new Person("kim"));
        map.put("010-1234-0678", new Person("cho"));
        map.put("010-3345-5678", new Person("park"));
        for(Map.Entry<String, Person> entry : map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        Scanner scan = new Scanner(System.in);
        while(true){
            String input = scan.nextLine();
        }

}
class PhoneNumber{

    public String phoneNumber;

    public PhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}


class Person{
    public String name;

    public Person(String person) {
        this.name = person;
    }

    }
}
