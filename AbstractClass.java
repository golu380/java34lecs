 abstract class Shape {

    String color;
    Shape( String color){
        this.color= color;
    }

    abstract double area();
    void  displayColor(){
        System.out.println("color is: "+color);
    }
    
}
class Size{
    String dimesion;
}

class Circle extends  Shape{

    double radius;
    Circle(double radius , String color){
        super(color);
        this.radius = radius;
        
    }

    double area(){
        return  Math.PI * radius * radius;
    }
}


public class AbstractClass {
    public static void  main(String [] args){

        System.out.println("hii");
        // Shape s1 = new Shape("blue"); we could not create objects for abstract class
        Circle c1 = new Circle(7, "saffron");
        // System.out.println(Math.PI);
       System.out.println("the area of cicle is"+c1.area());
       c1.displayColor();
    }
}
