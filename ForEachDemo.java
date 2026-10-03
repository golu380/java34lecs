import java.util.ArrayList;

public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList <String> students = new ArrayList<>();
        students.add("krishna");
        students.add("khushi");
        students.add("zaid");
        students.add("sumit");

        for (String students2 : students) {
            System.out.println(students2);
        }
        System.out.println("using for each");

        students.forEach(student-> System.out.println(student));
        System.out.println("useing for each 2nd form");
        students.forEach(System.out::println);

        //stream api

        ArrayList<Integer > numbers = new ArrayList<>();

        numbers.add(45);
          numbers.add(52);
            numbers.add(43);
              numbers.add(490);
          numbers.add(67);
            numbers.add(0);

           numbers.stream().filter(n->n>50).sorted().forEach(System.out::println);
    }
}
