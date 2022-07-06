import java.util.HashMap;
import java.util.Set;

public class InBuiltHashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> map= new HashMap<>();
        map.put("abc",1);
        map.put("def", 2);
        map.put("ghi", 3);
        System.out.println(map.size());
        if(map.containsKey("abc")){
            System.out.println("it has abc");
        }
        if(map.containsKey("abc1")){
            System.out.println("it has abc1");
        }
        //operations on value takes more time so it is O(n)
        if(map.containsValue(2)){
            System.out.println("it does");
        }
        //remove, will return the deleted value
        int deletedValue=map.remove("ghi");
        System.out.println(deletedValue);


            //iterate over the map
       Set<String>keys= map.keySet();
       for(String str: keys){
           System.out.println(str);
       }
    }
}
