package Streams;
import java.util.*;

import java.util.Arrays;

public class Student {
    int id;
    String name;
    int marks;
    public Student(int id, String name, int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    public String toString(){
        return id+" "+ name+" "+ marks+" ";
    }
 }
  class Main{
    public static void main(String[] args) {
        List<Student> student= Arrays.asList(
            new Student(1, "Shivam",85),
            new Student(2,"Kumar",94),
            new Student(3,"Kashyap",90)
        );

        student.stream().filter(m->m.marks>87).forEach(System.out::println);
    }

}

