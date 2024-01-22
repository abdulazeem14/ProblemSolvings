package Core_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparable_Concept {

    public static void  main(String args[]){


       List<Student> students=new ArrayList<>();
       students.add(new Student(3,"Harry","BLR"));
       students.add(new Student(2,"Mike","Chennai"));
       students.add(new Student(1,"Tom","TRZ"));
       System.out.println(students.get(0).id);
        Collections.sort(students);
        System.out.println(students.get(0).id);



    }


}
class Student implements Comparable<Student>{
    int id;
    String name;
    String location;
    public Student(int id,String name, String location)
    {
        this.id=id;
        this.name=name;
        this.location=location;
    }

    public  int compareTo(Student o) {
        return this.id>o.id?1:-1;
    }
}
