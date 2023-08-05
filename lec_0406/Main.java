package lec_0406;

import java.util.Objects;

public class Main {
    public static void main(String[] args){
        Student s1 = new Student("A123", "John", 20, "����", "����");
        Student s2 = new Student("A123", "John", 20, "����", "����");
        Student s3 = new Student("A456", "Selly", 19, "����", "����");
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); //false(�⺻������ s1 == s2�� ����)
        //equals �޼��带 �������̵��ؼ� true�� ���;� ��
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
}

class Student {
    private String id;
    private String name;
    private int age;
    private String gender;
    private String hobby;

    public Student(String id, String name, int age, String gender, String hobby) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age
                && Objects.equals(id, student.id)
                && Objects.equals(name, student.name)
                && Objects.equals(gender, student.gender)
                && Objects.equals(hobby, student.hobby);
    }

}