import  java.util.HashMap;
import java.util.Map;

public class HashMapDemo{
    public static void main(String[] args) {
        System.out.println("hii..");

        HashMap <Integer,String> mp = new HashMap<>();
         mp.put(103,"khushi");
        mp.put(101,"krishna");
        mp.put(102,"zaid");
       
        mp.put(104,"priya");
        System.out.println(mp);
        mp.put(102, "tanmay");

         mp.put(103,"khushi");
        mp.put(105,"krishna");
        mp.put(109,"zaid");
       
        mp.put(111,"priya");
        System.out.println(mp);
        mp.put(12, "tanmay");
        System.out.println(mp);

        for(Map.Entry<Integer,String> entry : mp.entrySet()){
            System.out.println(
                "id: "+ entry.getKey() + " -> "+  entry.getValue()
            );
        }

    }

}