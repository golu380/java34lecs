import  java.util.ArrayList;
import  java.util.Comparator;
class Employee{
    int id;
    String name;
    double salary;

    Employee(int id, String name,double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String  toString(){
        return  id + " | " + name +" | "+salary;
    }
}

public class ComparatorDemo {
    
    public static void main(String [] args){
        System.out.println("hii..");
        ArrayList<Employee> employees = new ArrayList<>();
        Employee emp = new Employee(101, "zaid", 600000);
        employees.add(emp);
        employees.add(new Employee(105, "krishna", 70000));
        employees.add(new Employee(103, "shivam", 450000));
        employees.add(new Employee(102, "khush", 30000));
          Employee emp1 = new Employee(109, "amit", 30000);
          employees.add(emp1);
        // System.out.println(employees);
        for(int i = 0;i<employees.size();i++){
            System.out.println(employees.get(i));
        }
        employees.sort(Comparator.comparingDouble(e->e.salary));

System.out.println("after sorting sailary wise");
          for(int i = 0;i<employees.size();i++){
            System.out.println(employees.get(i));
        }

        employees.sort(Comparator.comparingInt(e->e.id));
System.out.println("after sorting with id");
        for(Employee e : employees){
            System.err.println(e);
        }
       
         employees.sort(Comparator.comparing(e->e.name));
System.out.println("after sorting by name");
        for(Employee e : employees){
            System.err.println(e);
        }
    }
}
