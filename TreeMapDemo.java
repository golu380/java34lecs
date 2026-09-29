import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String,String> tmp = new TreeMap<>();

        tmp.put("amit","Dueby");
        tmp.put("virat","kohali");
        tmp.put("rohit","sharma");
        tmp.put("kushi","kumari");
        System.out.println(tmp);

        for(Map.Entry<String,String> entry: tmp.entrySet()){
            System.out.println("key " + entry.getKey() + "-> "+entry.getValue());
        }
    }
}
