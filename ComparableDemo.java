import  java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{

    int id;
    String name;
    int marks;

    Student(int id,String name,int marks){
        this.id = id;
        this.name =name;
        this.marks= marks;
    }

    public int compareTo(Student other){
        return Integer.compare(this.id, other.id);
    }

    public String toString(){
        return id + " " + name + " " + marks;
    }

}

public class ComparableDemo {
  public static void main(String[] args) {

    ArrayList<Student> sts = new ArrayList<>();

    sts.add(new Student(101,"Krishna",90));
     sts.add(new Student(102,"tanmay",78));
      sts.add(new Student(105,"shreya",116));
       sts.add(new Student(109,"zaid",56));
        sts.add(new Student(100,"Amit",23));

    Collections.sort(sts);

    System.out.println(sts);
  }
}
