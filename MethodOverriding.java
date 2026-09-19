// Method overriding

class Vehicle{
    void startEngine(){
        System.out.println("Vehicle is started!");
    }
}
class Car extends  Vehicle{
    void startEngine(){
        System.out.println("Car is started!");
    }
}

class Bike extends  Vehicle{
    void startEngine(){
        System.out.println("Bike is started!");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        System.out.println("hii..");
        Vehicle c = new Car();
        c.startEngine();
        Vehicle b = new Bike();
        b.startEngine();
        Vehicle v = new Vehicle();
        v.startEngine();
    }
}
