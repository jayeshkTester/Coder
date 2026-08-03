package Capgemini_April;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateValue_List {

    //Find duplicate values from list

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,2,4,5,1);

        Set<Integer> seen =new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();

        for (int num: list){
            if (!seen.add(num)){
                duplicate.add(num);
            }
        }
        System.out.println(duplicate);
    }
}
