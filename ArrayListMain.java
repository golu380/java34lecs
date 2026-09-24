import java.util.ArrayList;

public class ArrayListMain {
    public static void main(String[] args) {
        System.out.println("hii..");

        ArrayList <String> students = new ArrayList<>();

        //adding elememnt

        students.add("Khushi");
        students.add("krishna");
        students.add("zaid");
        students.add("kuchhv ..");
        students.add("Khushi");
        students.add("krishna");
        students.add("zaid");
        students.add("python");
        students.add("Khushi");
        students.add("student");
        students.add("cricket");
        students.add("java.");

        // showing list
        System.out.println(students);

        System.out.println(students.get(3));

        students.set(3,"amit");
        System.err.println(students);
        System.out.println("is there ? " +students.contains("krishna"));

        System.out.println(students.size());

        for(int i = 0;i<students.size();i++){
            System.out.println(students.get(i));
        }
System.out.println("printing with second type of loop");
        for(String st:students){
            System.out.println(st);
        }
        System.out.println(students.isEmpty());
        students.clear();
        System.out.println((students));
        System.out.println(students.isEmpty());

    }
}
