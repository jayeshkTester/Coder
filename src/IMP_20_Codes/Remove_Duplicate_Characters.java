package IMP_20_Codes;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Remove_Duplicate_Characters {

    public static void main(String[] args) {
        String str = "Programming";
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (char c : str.toCharArray()) {
            set.add(c);
        }
        for (char c : set) {
            System.out.println(c);
        }
    }
}
