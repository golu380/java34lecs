import java.util.ArrayList;
import java.util.Comparator;

import java.util.stream.Collectors;
import  java.util.List;

class Student{
    int id;
    int marks;
    String name;

    Student(int id,int marks, String name){
        this.id = id;
        this.marks = marks;
        this.name = name;
    }

    public String toString(){
        return  id + " " + marks + " " + name;
    }
}
public class ModernjavaDemo {
    public  static  void main(String [] args){

        ArrayList <Student> students = new ArrayList<>();
        students.add(new Student(101,90, "sumit"));
         students.add(new Student(103,70, "aman"));
          students.add(new Student(100,80, "sana"));
           students.add(new Student(107,90, "shryea"));
            students.add(new Student(106,60, "priya"));
             students.add(new Student(104,40, "kajal"));
              students.add(new Student(1011,90, "zaid"));
               students.add(new Student(156,40, "khushi"));
                students.add(new Student(190,10, "Amit"));
            System.out.println("all students");

        students.forEach(System.out::println);
        System.out.println("all students who got greater than 60");
        students.stream().filter(s->s.marks>60).forEach(System.out::println);
        System.out.println("student in sorted order marks wise");

        students.stream().sorted(Comparator.comparingInt(s->s.marks)).forEach(System.out::println);

        System.out.println("student sorted marks wise in reverse or descending order");

        students.stream().sorted(Comparator.comparingInt((Student s)->s.marks).reversed()).forEach(System.out::println);
        System.out.println("printing students names");

        students.stream().map(s->s.name).forEach(System.out::println);

        List <Student> passedStudents = students.stream().filter(s->s.marks>70).collect(Collectors.toList());
        passedStudents.forEach(System.out::println);
    }

}
