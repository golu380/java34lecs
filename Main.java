class Animal{
    String name;

    public Animal(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }
}
class Human{
    String name;
}

class Dog extends  Animal{
    String breed;

    public Dog(String name,String breed){
        super(name);
        this.breed = breed;
        
    }

    public  void bark(){
        System.out.println(name + " is barking!");
        super.eat();
        System.out.println(super.name);
    }
}

public class Main{

    public static void main(String [] args){
        System.out.println("hii");

        Dog d1 = new Dog("tommy", "golden retriever");
        d1.eat();
        d1.bark();
        System.out.println(d1.breed);
        System.out.println(d1.name);

        Tutor t1 = new Tutor("Amit", "CSE");
        t1.displayData();
        Tutor.displayData();

    }
}