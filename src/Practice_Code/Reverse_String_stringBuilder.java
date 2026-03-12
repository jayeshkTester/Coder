package Practice_Code;

public class Reverse_String_stringBuilder {
    public static void main(String[] args){
        String s = "I am automation test engineer";
        StringBuilder sb = new StringBuilder();

         sb.append(s);
         sb.reverse();

        System.out.println(sb);
    }
}
