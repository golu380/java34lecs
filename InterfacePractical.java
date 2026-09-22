interface Drawble{
    void draw();
}


    interface Resizable{
        void resize(double factor);
    }
class Circle implements  Drawble,Resizable{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }

    public void draw(){
        System.out.println("drawing circle of radious: "+radius);
    }

    public  void resize(double factor){
        radius = radius * factor;
        System.out.println("updated radious is "+ radius);
    }



}
public class InterfacePractical{

    public static void main(String [] args){
        System.out.println("hiii");
        Circle c1 = new Circle(7);
        c1.draw();
        c1.resize(2);
    }
}