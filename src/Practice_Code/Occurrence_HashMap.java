package Practice_Code;

import java.util.HashMap;
import java.util.Map;

public class Occurrence_HashMap {

    public static void main(String[] args){
        String s = "Account Occurrence";
        Map<Character, Integer> countMap = new HashMap<>();

        for (char c: s.toCharArray()){
            countMap.put(c,countMap.getOrDefault(c,0)+1);

        }
        System.out.println("Occurrence: ");
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
