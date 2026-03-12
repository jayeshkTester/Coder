package Practice_Code;

public class Reverse_String_forLoop {
    public static void main(String[] args){
        String s = "I am an automation test engineer";
        String a = " ";

         for ( int i = 0; i<s.length(); i++) {
             a = s.charAt(i) + a;
         }
        System.out.println(a);
    }
}
