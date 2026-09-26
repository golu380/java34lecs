import java.util.Iterator;
import java.util.LinkedList;

public class LikedLIstDemo {
    public static void main(String[] args) {

        LinkedList <String> students = new LinkedList<>();
        students.add("khushi");
        students.add("krishna");
        students.add("ravi");
        students.add("rahul");
        students.add("kuchhv");

        System.out.println(students);

        students.addFirst("zaid");
        students.addLast("priya");
        System.out.println(students);

        students.removeFirst();
        students.removeLast();
        System.out.println(students);

        Iterator <String> it = students.iterator();
        System.out.println("printing with iterator");

        while (it.hasNext()) {
            String student = it.next();
            System.out.println(student);
            
        }
        
    }
}
