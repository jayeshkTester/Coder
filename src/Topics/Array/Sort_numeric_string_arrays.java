package Topics.Array;

import java.util.Arrays;

public class Sort_numeric_string_arrays {

    // Write a Java program to sort a numeric array and a string array.

    public static void main(String[] args){
        int[] array = {1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};

        String[] array2 = {"Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"};

        System.out.println("Original numeric array: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted numeric array : " + Arrays.toString(array));

        System.out.println("Original numeric array: " + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted numeric array : " + Arrays.toString(array2));
    }
}
