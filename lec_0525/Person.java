package lec_0525;

import java.util.HashMap;

public class Person {
    public static void main(String [] args){
        HashMap<Object, Object> person = new HashMap<>();
        person.put("name", "Kim");
        person.put("age", 18);
        person.put("gender", "Female");
        System.out.println(person.get("name"));
        System.out.println(person.get("age"));
        System.out.println(person.get("gender"));

    }
}
