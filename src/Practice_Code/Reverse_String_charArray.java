package Practice_Code;

public class Reverse_String_charArray {
    public static void main(String[] args){
        String s = "automation test engineer";
        char[] arr = s.toCharArray();

         for ( int i = arr.length-1; i>=0; i--) {

             System.out.print(arr[i]);
         }
    }
}
