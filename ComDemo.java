import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements  Comparable<Student>{

    String name;
    int age;
    int rollno;
    int marks;

    Student(String name,int age, int rollno,int marks){
        this.name = name;
        this.age  = age;
        this.rollno = rollno;
        this.marks = marks;
    }

    public  int compareTo(Student other){
        return Integer.compare(this.rollno, other.rollno);
    }

    public  String toString(){
        return  name + "| " + age + "| " + rollno + " | " + marks;
    }
}

public class ComDemo {

    public static void main(String[] args) {
        
    ArrayList<Student> arr = new ArrayList<>();

    arr.add(new Student("amit",20,101,100));
    arr.add(new Student("akhil", 30, 202, 78));
     arr.add(new Student("khushi", 30, 20, 780));
      arr.add(new Student("sumit", 70, 200, 7));
       arr.add(new Student("james", 30, 292, 8));


System.out.println("original list");
        for (Student st: arr){
        System.out.println(st);
       }

       Collections.sort(arr);

       System.out.println("sorting by rollno");

       for (Student st: arr){
        System.out.println(st);
       }


       arr.sort( Comparator.comparingInt(e->e.marks));

       System.out.println("sorting by marks");

       for(Student st1 : arr){
        System.out.println(st1);
       }

      
    }
}
