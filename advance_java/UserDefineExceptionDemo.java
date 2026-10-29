class MyExp extends Exception{
    String str;
    MyExp(String str){
        this.str = str;
    }

    public String toString(){
        return "Exception occured " + str;
    }
}


public class UserDefineExceptionDemo {


    public static  void main(String [] args)throws MyExp{
        System.out.println("hii..");

      
        
       


        try{
            System.out.println("program is in try block");
            throw new MyExp("user defined exception occurred");

        }catch(MyExp err){
            System.out.println("program is in catch block");
            System.out.println(err);
        }


    }
}
