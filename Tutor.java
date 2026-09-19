public class Tutor {

   static  String name;
    static  String domain;

    Tutor(String name,String domain){
        this.name = name;
        this.domain = domain;
    }
   static void displayData(){
        System.out.println("the name of tutor is : "+name);
        System.out.println("the domain of tuotr is "+domain);
    }
    
}
