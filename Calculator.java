// method overloading

class Cal_practice{
    int add(int a,int b){
        return a + b;
    }
    int add(int a,int b,int c){
        return  a + b+c;
    }
    int add(int a){
        return a;
    }
}

public class Calculator {
    public static void main(String[] args) {
        System.out.println("hii");
        Cal_practice c1 = new Cal_practice();
        System.out.println(c1.add(12,13));
       
         System.out.println( c1.add(12,13,14));
       
         System.out.println(  c1.add(23));
        
    }
}
