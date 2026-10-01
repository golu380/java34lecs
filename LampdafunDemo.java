interface Calculator{
    int calculate(int a,int b);
}

public class LampdafunDemo{
    public static void main(String [] args){

        Calculator add = (a,b)->a+b;
        Calculator mul = (a,b)->a*b;

        System.out.println(add.calculate(12,13));
           System.out.println(mul.calculate(12,13));
        

    }
}